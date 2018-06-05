package com.zcbl.client.testdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ViewStubCompat;
import android.util.Log;
import android.widget.Toast;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        modifyFiled();


    }

    private void modifyFiled() {

        Class<Person> personClass = Person.class;
        try {
            Constructor<Person> constructor = personClass.getConstructor();
            Person person = constructor.newInstance();

            //修改没有
            Field name = personClass.getDeclaredField("name");
            name.setAccessible(true);
            name.set(person,"android");
            Log.i(TAG, "-----private String name----->"+name.get(person));

            Field age = personClass.getDeclaredField("age");
            age.setAccessible(true);
            age.set(null,300);
            Log.i(TAG, "----private final int age = 10---->"+age.get(person));

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

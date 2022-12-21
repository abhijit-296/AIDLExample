package com.huawei.demoforaidlclient;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class MyService extends Service {

    MyImpl myImpl = new MyImpl();

    @Override
    public IBinder onBind(Intent intent) {
        return myImpl;
    }

    private class MyImpl extends ICommon.Stub
    {
        @Override
        public int calculate(int num1, int num2) throws RemoteException {
            return num1+num2;
        }
    }
}
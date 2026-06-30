/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: /Users/Otokaze/Android/build-tools/36.0.0/aidl -p/Users/Otokaze/Android/platforms/android-36/framework.aidl -o/Users/Otokaze/Android/src/AutoJs6/plugin-api/paddle-ocr-api/build/generated/aidl_source_output_dir/debug/out -I/Users/Otokaze/Android/src/AutoJs6/plugin-api/paddle-ocr-api/src/main/aidl -I/Users/Otokaze/Android/src/AutoJs6/plugin-api/paddle-ocr-api/src/debug/aidl -d/var/folders/gg/m1wnmy1d5dv2t6m0v92xt_jh0000gn/T/aidl9791411749106644710.d /Users/Otokaze/Android/src/AutoJs6/plugin-api/paddle-ocr-api/src/main/aidl/org/autojs/plugin/paddle/ocr/api/IOcrPlugin.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package org.autojs.plugin.paddle.ocr.api;
public interface IOcrPlugin extends android.os.IInterface
{
  /** Default implementation for IOcrPlugin. */
  public static class Default implements org.autojs.plugin.paddle.ocr.api.IOcrPlugin
  {
    @Override public org.autojs.plugin.paddle.ocr.api.PluginInfo getInfo() throws android.os.RemoteException
    {
      return null;
    }
    @Override public java.util.List<java.lang.String> recognizeText(android.os.ParcelFileDescriptor imageFd, org.autojs.plugin.paddle.ocr.api.OcrOptions options) throws android.os.RemoteException
    {
      return null;
    }
    @Override public java.util.List<org.autojs.plugin.paddle.ocr.api.OcrResult> detect(android.os.ParcelFileDescriptor imageFd, org.autojs.plugin.paddle.ocr.api.OcrOptions options) throws android.os.RemoteException
    {
      return null;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements org.autojs.plugin.paddle.ocr.api.IOcrPlugin
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.autojs.plugin.paddle.ocr.api.IOcrPlugin interface,
     * generating a proxy if needed.
     */
    public static org.autojs.plugin.paddle.ocr.api.IOcrPlugin asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.autojs.plugin.paddle.ocr.api.IOcrPlugin))) {
        return ((org.autojs.plugin.paddle.ocr.api.IOcrPlugin)iin);
      }
      return new org.autojs.plugin.paddle.ocr.api.IOcrPlugin.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      if (code >= android.os.IBinder.FIRST_CALL_TRANSACTION && code <= android.os.IBinder.LAST_CALL_TRANSACTION) {
        data.enforceInterface(descriptor);
      }
      if (code == INTERFACE_TRANSACTION) {
        reply.writeString(descriptor);
        return true;
      }
      switch (code)
      {
        case TRANSACTION_getInfo:
        {
          org.autojs.plugin.paddle.ocr.api.PluginInfo _result = this.getInfo();
          reply.writeNoException();
          _Parcel.writeTypedObject(reply, _result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_recognizeText:
        {
          android.os.ParcelFileDescriptor _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.ParcelFileDescriptor.CREATOR);
          org.autojs.plugin.paddle.ocr.api.OcrOptions _arg1;
          _arg1 = _Parcel.readTypedObject(data, org.autojs.plugin.paddle.ocr.api.OcrOptions.CREATOR);
          java.util.List<java.lang.String> _result = this.recognizeText(_arg0, _arg1);
          reply.writeNoException();
          reply.writeStringList(_result);
          break;
        }
        case TRANSACTION_detect:
        {
          android.os.ParcelFileDescriptor _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.ParcelFileDescriptor.CREATOR);
          org.autojs.plugin.paddle.ocr.api.OcrOptions _arg1;
          _arg1 = _Parcel.readTypedObject(data, org.autojs.plugin.paddle.ocr.api.OcrOptions.CREATOR);
          java.util.List<org.autojs.plugin.paddle.ocr.api.OcrResult> _result = this.detect(_arg0, _arg1);
          reply.writeNoException();
          _Parcel.writeTypedList(reply, _result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements org.autojs.plugin.paddle.ocr.api.IOcrPlugin
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public org.autojs.plugin.paddle.ocr.api.PluginInfo getInfo() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.autojs.plugin.paddle.ocr.api.PluginInfo _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getInfo, _data, _reply, 0);
          _reply.readException();
          _result = _Parcel.readTypedObject(_reply, org.autojs.plugin.paddle.ocr.api.PluginInfo.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public java.util.List<java.lang.String> recognizeText(android.os.ParcelFileDescriptor imageFd, org.autojs.plugin.paddle.ocr.api.OcrOptions options) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List<java.lang.String> _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, imageFd, 0);
          _Parcel.writeTypedObject(_data, options, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_recognizeText, _data, _reply, 0);
          _reply.readException();
          _result = _reply.createStringArrayList();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public java.util.List<org.autojs.plugin.paddle.ocr.api.OcrResult> detect(android.os.ParcelFileDescriptor imageFd, org.autojs.plugin.paddle.ocr.api.OcrOptions options) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.List<org.autojs.plugin.paddle.ocr.api.OcrResult> _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, imageFd, 0);
          _Parcel.writeTypedObject(_data, options, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_detect, _data, _reply, 0);
          _reply.readException();
          _result = _reply.createTypedArrayList(org.autojs.plugin.paddle.ocr.api.OcrResult.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
    }
    static final int TRANSACTION_getInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_recognizeText = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_detect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "org.autojs.plugin.paddle.ocr.api.IOcrPlugin";
  public org.autojs.plugin.paddle.ocr.api.PluginInfo getInfo() throws android.os.RemoteException;
  public java.util.List<java.lang.String> recognizeText(android.os.ParcelFileDescriptor imageFd, org.autojs.plugin.paddle.ocr.api.OcrOptions options) throws android.os.RemoteException;
  public java.util.List<org.autojs.plugin.paddle.ocr.api.OcrResult> detect(android.os.ParcelFileDescriptor imageFd, org.autojs.plugin.paddle.ocr.api.OcrOptions options) throws android.os.RemoteException;
  /** @hide */
  static class _Parcel {
    static private <T> T readTypedObject(
        android.os.Parcel parcel,
        android.os.Parcelable.Creator<T> c) {
      if (parcel.readInt() != 0) {
          return c.createFromParcel(parcel);
      } else {
          return null;
      }
    }
    static private <T extends android.os.Parcelable> void writeTypedObject(
        android.os.Parcel parcel, T value, int parcelableFlags) {
      if (value != null) {
        parcel.writeInt(1);
        value.writeToParcel(parcel, parcelableFlags);
      } else {
        parcel.writeInt(0);
      }
    }
    static private <T extends android.os.Parcelable> void writeTypedList(
        android.os.Parcel parcel, java.util.List<T> value, int parcelableFlags) {
      if (value == null) {
        parcel.writeInt(-1);
      } else {
        int N = value.size();
        int i = 0;
        parcel.writeInt(N);
        while (i < N) {
    writeTypedObject(parcel, value.get(i), parcelableFlags);
          i++;
        }
      }
    }
  }
}

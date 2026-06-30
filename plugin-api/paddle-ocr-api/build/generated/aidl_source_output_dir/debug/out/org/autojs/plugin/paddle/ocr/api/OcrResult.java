/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: /Users/Otokaze/Android/build-tools/36.0.0/aidl -p/Users/Otokaze/Android/platforms/android-36/framework.aidl -o/Users/Otokaze/Android/src/AutoJs6/plugin-api/paddle-ocr-api/build/generated/aidl_source_output_dir/debug/out -I/Users/Otokaze/Android/src/AutoJs6/plugin-api/paddle-ocr-api/src/main/aidl -I/Users/Otokaze/Android/src/AutoJs6/plugin-api/paddle-ocr-api/src/debug/aidl -d/var/folders/gg/m1wnmy1d5dv2t6m0v92xt_jh0000gn/T/aidl13869167792941020153.d /Users/Otokaze/Android/src/AutoJs6/plugin-api/paddle-ocr-api/src/main/aidl/org/autojs/plugin/paddle/ocr/api/OcrResult.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package org.autojs.plugin.paddle.ocr.api;
public class OcrResult implements android.os.Parcelable
{
  public java.lang.String text;
  public float confidence = 0.000000f;
  public android.graphics.Rect bounds;
  public android.os.Bundle extras;
  public static final android.os.Parcelable.Creator<OcrResult> CREATOR = new android.os.Parcelable.Creator<OcrResult>() {
    @Override
    public OcrResult createFromParcel(android.os.Parcel _aidl_source) {
      OcrResult _aidl_out = new OcrResult();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public OcrResult[] newArray(int _aidl_size) {
      return new OcrResult[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeString(text);
    _aidl_parcel.writeFloat(confidence);
    _Parcel.writeTypedObject(_aidl_parcel, bounds, _aidl_flag);
    _Parcel.writeTypedObject(_aidl_parcel, extras, _aidl_flag);
    int _aidl_end_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.setDataPosition(_aidl_start_pos);
    _aidl_parcel.writeInt(_aidl_end_pos - _aidl_start_pos);
    _aidl_parcel.setDataPosition(_aidl_end_pos);
  }
  public final void readFromParcel(android.os.Parcel _aidl_parcel)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    int _aidl_parcelable_size = _aidl_parcel.readInt();
    try {
      if (_aidl_parcelable_size < 4) throw new android.os.BadParcelableException("Parcelable too small");;
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      text = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      confidence = _aidl_parcel.readFloat();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      bounds = _Parcel.readTypedObject(_aidl_parcel, android.graphics.Rect.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      extras = _Parcel.readTypedObject(_aidl_parcel, android.os.Bundle.CREATOR);
    } finally {
      if (_aidl_start_pos > (Integer.MAX_VALUE - _aidl_parcelable_size)) {
        throw new android.os.BadParcelableException("Overflow in the size of parcelable");
      }
      _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
    }
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    _mask |= describeContents(bounds);
    _mask |= describeContents(extras);
    return _mask;
  }
  private int describeContents(Object _v) {
    if (_v == null) return 0;
    if (_v instanceof android.os.Parcelable) {
      return ((android.os.Parcelable) _v).describeContents();
    }
    return 0;
  }
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
  }
}

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: /Users/Otokaze/Android/build-tools/36.0.0/aidl -p/Users/Otokaze/Android/platforms/android-36/framework.aidl -o/Users/Otokaze/Android/src/AutoJs6/plugin-api/paddle-ocr-api/build/generated/aidl_source_output_dir/debug/out -I/Users/Otokaze/Android/src/AutoJs6/plugin-api/paddle-ocr-api/src/main/aidl -I/Users/Otokaze/Android/src/AutoJs6/plugin-api/paddle-ocr-api/src/debug/aidl -d/var/folders/gg/m1wnmy1d5dv2t6m0v92xt_jh0000gn/T/aidl17963445102420958818.d /Users/Otokaze/Android/src/AutoJs6/plugin-api/paddle-ocr-api/src/main/aidl/org/autojs/plugin/paddle/ocr/api/PluginInfo.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package org.autojs.plugin.paddle.ocr.api;
public class PluginInfo implements android.os.Parcelable
{
  public java.lang.String name;
  public java.lang.String description;
  public java.lang.String author;
  public java.lang.String[] collaborators;
  public java.lang.String versionName;
  public long versionCode = 0L;
  public java.lang.String versionDate;
  /** @example "paddle-ocr-pp-ocrv5" */
  public java.lang.String id;
  /** @sample "paddle-ocr" */
  public java.lang.String engine;
  /** @sample "v5" */
  public java.lang.String variant;
  public android.os.Bundle capabilities;
  public static final android.os.Parcelable.Creator<PluginInfo> CREATOR = new android.os.Parcelable.Creator<PluginInfo>() {
    @Override
    public PluginInfo createFromParcel(android.os.Parcel _aidl_source) {
      PluginInfo _aidl_out = new PluginInfo();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public PluginInfo[] newArray(int _aidl_size) {
      return new PluginInfo[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeString(name);
    _aidl_parcel.writeString(description);
    _aidl_parcel.writeString(author);
    _aidl_parcel.writeStringArray(collaborators);
    _aidl_parcel.writeString(versionName);
    _aidl_parcel.writeLong(versionCode);
    _aidl_parcel.writeString(versionDate);
    _aidl_parcel.writeString(id);
    _aidl_parcel.writeString(engine);
    _aidl_parcel.writeString(variant);
    _Parcel.writeTypedObject(_aidl_parcel, capabilities, _aidl_flag);
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
      name = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      description = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      author = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      collaborators = _aidl_parcel.createStringArray();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      versionName = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      versionCode = _aidl_parcel.readLong();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      versionDate = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      id = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      engine = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      variant = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      capabilities = _Parcel.readTypedObject(_aidl_parcel, android.os.Bundle.CREATOR);
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
    _mask |= describeContents(capabilities);
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

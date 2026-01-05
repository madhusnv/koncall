package com.github.dhaval2404.colorpicker.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p001o.sq8;

/* loaded from: classes5.dex */
public enum ColorShape implements Parcelable {
    CIRCLE,
    SQAURE;

    public static final Parcelable.Creator<ColorShape> CREATOR = new Parcelable.Creator() { // from class: com.github.dhaval2404.colorpicker.model.ColorShape.a
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ColorShape createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return ColorShape.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ColorShape[] newArray(int i) {
            return new ColorShape[i];
        }
    };

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static ColorShape[] valuesCustom() {
        ColorShape[] colorShapeArrValuesCustom = values();
        return (ColorShape[]) Arrays.copyOf(colorShapeArrValuesCustom, colorShapeArrValuesCustom.length);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(name());
    }
}

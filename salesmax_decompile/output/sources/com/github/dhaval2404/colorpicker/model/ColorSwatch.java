package com.github.dhaval2404.colorpicker.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p001o.sq8;

/* loaded from: classes5.dex */
public enum ColorSwatch implements Parcelable {
    _50("50"),
    _100("100"),
    _200("200"),
    _300("300"),
    _400("400"),
    _500("500"),
    _600("600"),
    _700("700"),
    _800("800"),
    _900("900"),
    A100("a100"),
    A200("a200"),
    A300("a300"),
    A400("a400");

    public static final Parcelable.Creator<ColorSwatch> CREATOR = new Parcelable.Creator() { // from class: com.github.dhaval2404.colorpicker.model.ColorSwatch.a
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ColorSwatch createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return ColorSwatch.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ColorSwatch[] newArray(int i) {
            return new ColorSwatch[i];
        }
    };
    private final String value;

    ColorSwatch(String str) {
        this.value = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static ColorSwatch[] valuesCustom() {
        ColorSwatch[] colorSwatchArrValuesCustom = values();
        return (ColorSwatch[]) Arrays.copyOf(colorSwatchArrValuesCustom, colorSwatchArrValuesCustom.length);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getValue() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(name());
    }
}

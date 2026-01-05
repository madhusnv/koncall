package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapColorScheme;
import com.google.firebase.perf.util.Constants;

@SafeParcelable.Class(creator = "GoogleMapOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new zzac();
    private static final Integer zza = Integer.valueOf(Color.argb(Constants.MAX_HOST_LENGTH, 236, 233, 225));

    @SafeParcelable.Field(defaultValue = "-1", getter = "getZOrderOnTopForParcel", id = 2, type = "byte")
    private Boolean zzb;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getUseViewLifecycleInFragmentForParcel", id = 3, type = "byte")
    private Boolean zzc;

    @SafeParcelable.Field(getter = "getMapType", id = 4)
    private int zzd;

    @SafeParcelable.Field(getter = "getCamera", id = 5)
    private CameraPosition zze;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getZoomControlsEnabledForParcel", id = 6, type = "byte")
    private Boolean zzf;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getCompassEnabledForParcel", id = 7, type = "byte")
    private Boolean zzg;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getScrollGesturesEnabledForParcel", id = 8, type = "byte")
    private Boolean zzh;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getZoomGesturesEnabledForParcel", id = 9, type = "byte")
    private Boolean zzi;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getTiltGesturesEnabledForParcel", id = 10, type = "byte")
    private Boolean zzj;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getRotateGesturesEnabledForParcel", id = 11, type = "byte")
    private Boolean zzk;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getLiteModeForParcel", id = 12, type = "byte")
    private Boolean zzl;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getMapToolbarEnabledForParcel", id = 14, type = "byte")
    private Boolean zzm;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getAmbientEnabledForParcel", id = 15, type = "byte")
    private Boolean zzn;

    @SafeParcelable.Field(getter = "getMinZoomPreference", id = 16)
    private Float zzo;

    @SafeParcelable.Field(getter = "getMaxZoomPreference", id = 17)
    private Float zzp;

    @SafeParcelable.Field(getter = "getLatLngBoundsForCameraTarget", id = 18)
    private LatLngBounds zzq;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getScrollGesturesEnabledDuringRotateOrZoomForParcel", id = 19, type = "byte")
    private Boolean zzr;

    @SafeParcelable.Field(getter = "getBackgroundColor", id = 20)
    private Integer zzs;

    @SafeParcelable.Field(getter = "getMapId", id = 21)
    private String zzt;

    @MapColorScheme
    @SafeParcelable.Field(defaultValue = "0", getter = "getMapColorScheme", id = 23, type = "int")
    private int zzu;

    public GoogleMapOptions() {
        this.zzd = -1;
        this.zzo = null;
        this.zzp = null;
        this.zzq = null;
        this.zzs = null;
        this.zzt = null;
    }

    public static GoogleMapOptions createFromAttributes(Context context, AttributeSet attributeSet) {
        String string;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, C10914R.styleable.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (typedArrayObtainAttributes.hasValue(C10914R.styleable.MapAttrs_mapType)) {
            googleMapOptions.mapType(typedArrayObtainAttributes.getInt(C10914R.styleable.MapAttrs_mapType, -1));
        }
        if (typedArrayObtainAttributes.hasValue(C10914R.styleable.MapAttrs_zOrderOnTop)) {
            googleMapOptions.zOrderOnTop(typedArrayObtainAttributes.getBoolean(C10914R.styleable.MapAttrs_zOrderOnTop, false));
        }
        if (typedArrayObtainAttributes.hasValue(C10914R.styleable.MapAttrs_useViewLifecycle)) {
            googleMapOptions.useViewLifecycleInFragment(typedArrayObtainAttributes.getBoolean(C10914R.styleable.MapAttrs_useViewLifecycle, false));
        }
        if (typedArrayObtainAttributes.hasValue(C10914R.styleable.MapAttrs_uiCompass)) {
            googleMapOptions.compassEnabled(typedArrayObtainAttributes.getBoolean(C10914R.styleable.MapAttrs_uiCompass, true));
        }
        if (typedArrayObtainAttributes.hasValue(C10914R.styleable.MapAttrs_uiRotateGestures)) {
            googleMapOptions.rotateGesturesEnabled(typedArrayObtainAttributes.getBoolean(C10914R.styleable.MapAttrs_uiRotateGestures, true));
        }
        if (typedArrayObtainAttributes.hasValue(C10914R.styleable.MapAttrs_uiScrollGesturesDuringRotateOrZoom)) {
            googleMapOptions.scrollGesturesEnabledDuringRotateOrZoom(typedArrayObtainAttributes.getBoolean(C10914R.styleable.MapAttrs_uiScrollGesturesDuringRotateOrZoom, true));
        }
        if (typedArrayObtainAttributes.hasValue(C10914R.styleable.MapAttrs_uiScrollGestures)) {
            googleMapOptions.scrollGesturesEnabled(typedArrayObtainAttributes.getBoolean(C10914R.styleable.MapAttrs_uiScrollGestures, true));
        }
        if (typedArrayObtainAttributes.hasValue(C10914R.styleable.MapAttrs_uiTiltGestures)) {
            googleMapOptions.tiltGesturesEnabled(typedArrayObtainAttributes.getBoolean(C10914R.styleable.MapAttrs_uiTiltGestures, true));
        }
        if (typedArrayObtainAttributes.hasValue(C10914R.styleable.MapAttrs_uiZoomGestures)) {
            googleMapOptions.zoomGesturesEnabled(typedArrayObtainAttributes.getBoolean(C10914R.styleable.MapAttrs_uiZoomGestures, true));
        }
        if (typedArrayObtainAttributes.hasValue(C10914R.styleable.MapAttrs_uiZoomControls)) {
            googleMapOptions.zoomControlsEnabled(typedArrayObtainAttributes.getBoolean(C10914R.styleable.MapAttrs_uiZoomControls, true));
        }
        if (typedArrayObtainAttributes.hasValue(C10914R.styleable.MapAttrs_liteMode)) {
            googleMapOptions.liteMode(typedArrayObtainAttributes.getBoolean(C10914R.styleable.MapAttrs_liteMode, false));
        }
        if (typedArrayObtainAttributes.hasValue(C10914R.styleable.MapAttrs_uiMapToolbar)) {
            googleMapOptions.mapToolbarEnabled(typedArrayObtainAttributes.getBoolean(C10914R.styleable.MapAttrs_uiMapToolbar, true));
        }
        if (typedArrayObtainAttributes.hasValue(C10914R.styleable.MapAttrs_ambientEnabled)) {
            googleMapOptions.ambientEnabled(typedArrayObtainAttributes.getBoolean(C10914R.styleable.MapAttrs_ambientEnabled, false));
        }
        if (typedArrayObtainAttributes.hasValue(C10914R.styleable.MapAttrs_cameraMinZoomPreference)) {
            googleMapOptions.minZoomPreference(typedArrayObtainAttributes.getFloat(C10914R.styleable.MapAttrs_cameraMinZoomPreference, Float.NEGATIVE_INFINITY));
        }
        if (typedArrayObtainAttributes.hasValue(C10914R.styleable.MapAttrs_cameraMinZoomPreference)) {
            googleMapOptions.maxZoomPreference(typedArrayObtainAttributes.getFloat(C10914R.styleable.MapAttrs_cameraMaxZoomPreference, Float.POSITIVE_INFINITY));
        }
        if (typedArrayObtainAttributes.hasValue(C10914R.styleable.MapAttrs_backgroundColor)) {
            googleMapOptions.backgroundColor(Integer.valueOf(typedArrayObtainAttributes.getColor(C10914R.styleable.MapAttrs_backgroundColor, zza.intValue())));
        }
        if (typedArrayObtainAttributes.hasValue(C10914R.styleable.MapAttrs_mapId) && (string = typedArrayObtainAttributes.getString(C10914R.styleable.MapAttrs_mapId)) != null && !string.isEmpty()) {
            googleMapOptions.mapId(string);
        }
        if (typedArrayObtainAttributes.hasValue(C10914R.styleable.MapAttrs_mapColorScheme)) {
            googleMapOptions.mapColorScheme(typedArrayObtainAttributes.getInt(C10914R.styleable.MapAttrs_mapColorScheme, 0));
        }
        googleMapOptions.latLngBoundsForCameraTarget(zzb(context, attributeSet));
        googleMapOptions.camera(zza(context, attributeSet));
        typedArrayObtainAttributes.recycle();
        return googleMapOptions;
    }

    public static CameraPosition zza(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, C10914R.styleable.MapAttrs);
        LatLng latLng = new LatLng(typedArrayObtainAttributes.hasValue(C10914R.styleable.MapAttrs_cameraTargetLat) ? typedArrayObtainAttributes.getFloat(C10914R.styleable.MapAttrs_cameraTargetLat, 0.0f) : 0.0f, typedArrayObtainAttributes.hasValue(C10914R.styleable.MapAttrs_cameraTargetLng) ? typedArrayObtainAttributes.getFloat(C10914R.styleable.MapAttrs_cameraTargetLng, 0.0f) : 0.0f);
        CameraPosition.Builder builder = CameraPosition.builder();
        builder.target(latLng);
        if (typedArrayObtainAttributes.hasValue(C10914R.styleable.MapAttrs_cameraZoom)) {
            builder.zoom(typedArrayObtainAttributes.getFloat(C10914R.styleable.MapAttrs_cameraZoom, 0.0f));
        }
        if (typedArrayObtainAttributes.hasValue(C10914R.styleable.MapAttrs_cameraBearing)) {
            builder.bearing(typedArrayObtainAttributes.getFloat(C10914R.styleable.MapAttrs_cameraBearing, 0.0f));
        }
        if (typedArrayObtainAttributes.hasValue(C10914R.styleable.MapAttrs_cameraTilt)) {
            builder.tilt(typedArrayObtainAttributes.getFloat(C10914R.styleable.MapAttrs_cameraTilt, 0.0f));
        }
        typedArrayObtainAttributes.recycle();
        return builder.build();
    }

    public static LatLngBounds zzb(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, C10914R.styleable.MapAttrs);
        Float fValueOf = typedArrayObtainAttributes.hasValue(C10914R.styleable.MapAttrs_latLngBoundsSouthWestLatitude) ? Float.valueOf(typedArrayObtainAttributes.getFloat(C10914R.styleable.MapAttrs_latLngBoundsSouthWestLatitude, 0.0f)) : null;
        Float fValueOf2 = typedArrayObtainAttributes.hasValue(C10914R.styleable.MapAttrs_latLngBoundsSouthWestLongitude) ? Float.valueOf(typedArrayObtainAttributes.getFloat(C10914R.styleable.MapAttrs_latLngBoundsSouthWestLongitude, 0.0f)) : null;
        Float fValueOf3 = typedArrayObtainAttributes.hasValue(C10914R.styleable.MapAttrs_latLngBoundsNorthEastLatitude) ? Float.valueOf(typedArrayObtainAttributes.getFloat(C10914R.styleable.MapAttrs_latLngBoundsNorthEastLatitude, 0.0f)) : null;
        Float fValueOf4 = typedArrayObtainAttributes.hasValue(C10914R.styleable.MapAttrs_latLngBoundsNorthEastLongitude) ? Float.valueOf(typedArrayObtainAttributes.getFloat(C10914R.styleable.MapAttrs_latLngBoundsNorthEastLongitude, 0.0f)) : null;
        typedArrayObtainAttributes.recycle();
        if (fValueOf == null || fValueOf2 == null || fValueOf3 == null || fValueOf4 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng(fValueOf.floatValue(), fValueOf2.floatValue()), new LatLng(fValueOf3.floatValue(), fValueOf4.floatValue()));
    }

    public GoogleMapOptions ambientEnabled(boolean z) {
        this.zzn = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions backgroundColor(Integer num) {
        this.zzs = num;
        return this;
    }

    public GoogleMapOptions camera(CameraPosition cameraPosition) {
        this.zze = cameraPosition;
        return this;
    }

    public GoogleMapOptions compassEnabled(boolean z) {
        this.zzg = Boolean.valueOf(z);
        return this;
    }

    public Boolean getAmbientEnabled() {
        return this.zzn;
    }

    public Integer getBackgroundColor() {
        return this.zzs;
    }

    public CameraPosition getCamera() {
        return this.zze;
    }

    public Boolean getCompassEnabled() {
        return this.zzg;
    }

    public LatLngBounds getLatLngBoundsForCameraTarget() {
        return this.zzq;
    }

    public Boolean getLiteMode() {
        return this.zzl;
    }

    @MapColorScheme
    public int getMapColorScheme() {
        return this.zzu;
    }

    public String getMapId() {
        return this.zzt;
    }

    public Boolean getMapToolbarEnabled() {
        return this.zzm;
    }

    public int getMapType() {
        return this.zzd;
    }

    public Float getMaxZoomPreference() {
        return this.zzp;
    }

    public Float getMinZoomPreference() {
        return this.zzo;
    }

    public Boolean getRotateGesturesEnabled() {
        return this.zzk;
    }

    public Boolean getScrollGesturesEnabled() {
        return this.zzh;
    }

    public Boolean getScrollGesturesEnabledDuringRotateOrZoom() {
        return this.zzr;
    }

    public Boolean getTiltGesturesEnabled() {
        return this.zzj;
    }

    public Boolean getUseViewLifecycleInFragment() {
        return this.zzc;
    }

    public Boolean getZOrderOnTop() {
        return this.zzb;
    }

    public Boolean getZoomControlsEnabled() {
        return this.zzf;
    }

    public Boolean getZoomGesturesEnabled() {
        return this.zzi;
    }

    public GoogleMapOptions latLngBoundsForCameraTarget(LatLngBounds latLngBounds) {
        this.zzq = latLngBounds;
        return this;
    }

    public GoogleMapOptions liteMode(boolean z) {
        this.zzl = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions mapColorScheme(@MapColorScheme int i) {
        this.zzu = i;
        return this;
    }

    public GoogleMapOptions mapId(String str) {
        this.zzt = str;
        return this;
    }

    public GoogleMapOptions mapToolbarEnabled(boolean z) {
        this.zzm = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions mapType(int i) {
        this.zzd = i;
        return this;
    }

    public GoogleMapOptions maxZoomPreference(float f) {
        this.zzp = Float.valueOf(f);
        return this;
    }

    public GoogleMapOptions minZoomPreference(float f) {
        this.zzo = Float.valueOf(f);
        return this;
    }

    public GoogleMapOptions rotateGesturesEnabled(boolean z) {
        this.zzk = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions scrollGesturesEnabled(boolean z) {
        this.zzh = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions scrollGesturesEnabledDuringRotateOrZoom(boolean z) {
        this.zzr = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions tiltGesturesEnabled(boolean z) {
        this.zzj = Boolean.valueOf(z);
        return this;
    }

    public String toString() {
        return Objects.toStringHelper(this).add("MapType", Integer.valueOf(this.zzd)).add("LiteMode", this.zzl).add("Camera", this.zze).add("CompassEnabled", this.zzg).add("ZoomControlsEnabled", this.zzf).add("ScrollGesturesEnabled", this.zzh).add("ZoomGesturesEnabled", this.zzi).add("TiltGesturesEnabled", this.zzj).add("RotateGesturesEnabled", this.zzk).add("ScrollGesturesEnabledDuringRotateOrZoom", this.zzr).add("MapToolbarEnabled", this.zzm).add("AmbientEnabled", this.zzn).add("MinZoomPreference", this.zzo).add("MaxZoomPreference", this.zzp).add("BackgroundColor", this.zzs).add("LatLngBoundsForCameraTarget", this.zzq).add("ZOrderOnTop", this.zzb).add("UseViewLifecycleInFragment", this.zzc).add("mapColorScheme", Integer.valueOf(this.zzu)).toString();
    }

    public GoogleMapOptions useViewLifecycleInFragment(boolean z) {
        this.zzc = Boolean.valueOf(z);
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByte(parcel, 2, com.google.android.gms.maps.internal.zza.zza(this.zzb));
        SafeParcelWriter.writeByte(parcel, 3, com.google.android.gms.maps.internal.zza.zza(this.zzc));
        SafeParcelWriter.writeInt(parcel, 4, getMapType());
        SafeParcelWriter.writeParcelable(parcel, 5, getCamera(), i, false);
        SafeParcelWriter.writeByte(parcel, 6, com.google.android.gms.maps.internal.zza.zza(this.zzf));
        SafeParcelWriter.writeByte(parcel, 7, com.google.android.gms.maps.internal.zza.zza(this.zzg));
        SafeParcelWriter.writeByte(parcel, 8, com.google.android.gms.maps.internal.zza.zza(this.zzh));
        SafeParcelWriter.writeByte(parcel, 9, com.google.android.gms.maps.internal.zza.zza(this.zzi));
        SafeParcelWriter.writeByte(parcel, 10, com.google.android.gms.maps.internal.zza.zza(this.zzj));
        SafeParcelWriter.writeByte(parcel, 11, com.google.android.gms.maps.internal.zza.zza(this.zzk));
        SafeParcelWriter.writeByte(parcel, 12, com.google.android.gms.maps.internal.zza.zza(this.zzl));
        SafeParcelWriter.writeByte(parcel, 14, com.google.android.gms.maps.internal.zza.zza(this.zzm));
        SafeParcelWriter.writeByte(parcel, 15, com.google.android.gms.maps.internal.zza.zza(this.zzn));
        SafeParcelWriter.writeFloatObject(parcel, 16, getMinZoomPreference(), false);
        SafeParcelWriter.writeFloatObject(parcel, 17, getMaxZoomPreference(), false);
        SafeParcelWriter.writeParcelable(parcel, 18, getLatLngBoundsForCameraTarget(), i, false);
        SafeParcelWriter.writeByte(parcel, 19, com.google.android.gms.maps.internal.zza.zza(this.zzr));
        SafeParcelWriter.writeIntegerObject(parcel, 20, getBackgroundColor(), false);
        SafeParcelWriter.writeString(parcel, 21, getMapId(), false);
        SafeParcelWriter.writeInt(parcel, 23, getMapColorScheme());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public GoogleMapOptions zOrderOnTop(boolean z) {
        this.zzb = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions zoomControlsEnabled(boolean z) {
        this.zzf = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions zoomGesturesEnabled(boolean z) {
        this.zzi = Boolean.valueOf(z);
        return this;
    }

    @SafeParcelable.Constructor
    public GoogleMapOptions(@SafeParcelable.Param(id = 2) byte b, @SafeParcelable.Param(id = 3) byte b2, @SafeParcelable.Param(id = 4) int i, @SafeParcelable.Param(id = 5) CameraPosition cameraPosition, @SafeParcelable.Param(id = 6) byte b3, @SafeParcelable.Param(id = 7) byte b4, @SafeParcelable.Param(id = 8) byte b5, @SafeParcelable.Param(id = 9) byte b6, @SafeParcelable.Param(id = 10) byte b7, @SafeParcelable.Param(id = 11) byte b8, @SafeParcelable.Param(id = 12) byte b9, @SafeParcelable.Param(id = 14) byte b10, @SafeParcelable.Param(id = 15) byte b11, @SafeParcelable.Param(id = 16) Float f, @SafeParcelable.Param(id = 17) Float f2, @SafeParcelable.Param(id = 18) LatLngBounds latLngBounds, @SafeParcelable.Param(id = 19) byte b12, @SafeParcelable.Param(id = 20) Integer num, @SafeParcelable.Param(id = 21) String str, @SafeParcelable.Param(id = 23) @MapColorScheme int i2) {
        this.zzd = -1;
        this.zzo = null;
        this.zzp = null;
        this.zzq = null;
        this.zzs = null;
        this.zzt = null;
        this.zzb = com.google.android.gms.maps.internal.zza.zzb(b);
        this.zzc = com.google.android.gms.maps.internal.zza.zzb(b2);
        this.zzd = i;
        this.zze = cameraPosition;
        this.zzf = com.google.android.gms.maps.internal.zza.zzb(b3);
        this.zzg = com.google.android.gms.maps.internal.zza.zzb(b4);
        this.zzh = com.google.android.gms.maps.internal.zza.zzb(b5);
        this.zzi = com.google.android.gms.maps.internal.zza.zzb(b6);
        this.zzj = com.google.android.gms.maps.internal.zza.zzb(b7);
        this.zzk = com.google.android.gms.maps.internal.zza.zzb(b8);
        this.zzl = com.google.android.gms.maps.internal.zza.zzb(b9);
        this.zzm = com.google.android.gms.maps.internal.zza.zzb(b10);
        this.zzn = com.google.android.gms.maps.internal.zza.zzb(b11);
        this.zzo = f;
        this.zzp = f2;
        this.zzq = latLngBounds;
        this.zzr = com.google.android.gms.maps.internal.zza.zzb(b12);
        this.zzs = num;
        this.zzt = str;
        this.zzu = i2;
    }
}

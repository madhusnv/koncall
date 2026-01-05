package p001o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import org.apache.http.message.TokenParser;

/* loaded from: classes2.dex */
public abstract class in1 {
    /* renamed from: a */
    public static final Bundle m32434a() {
        return new Bundle(0);
    }

    /* renamed from: b */
    public static final Bundle m32435b(hwc... hwcVarArr) {
        Bundle bundle = new Bundle(hwcVarArr.length);
        for (hwc hwcVar : hwcVarArr) {
            String str = (String) hwcVar.m31227a();
            Object objM31228b = hwcVar.m31228b();
            if (objM31228b == null) {
                bundle.putString(str, null);
            } else if (objM31228b instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) objM31228b).booleanValue());
            } else if (objM31228b instanceof Byte) {
                bundle.putByte(str, ((Number) objM31228b).byteValue());
            } else if (objM31228b instanceof Character) {
                bundle.putChar(str, ((Character) objM31228b).charValue());
            } else if (objM31228b instanceof Double) {
                bundle.putDouble(str, ((Number) objM31228b).doubleValue());
            } else if (objM31228b instanceof Float) {
                bundle.putFloat(str, ((Number) objM31228b).floatValue());
            } else if (objM31228b instanceof Integer) {
                bundle.putInt(str, ((Number) objM31228b).intValue());
            } else if (objM31228b instanceof Long) {
                bundle.putLong(str, ((Number) objM31228b).longValue());
            } else if (objM31228b instanceof Short) {
                bundle.putShort(str, ((Number) objM31228b).shortValue());
            } else if (objM31228b instanceof Bundle) {
                bundle.putBundle(str, (Bundle) objM31228b);
            } else if (objM31228b instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) objM31228b);
            } else if (objM31228b instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) objM31228b);
            } else if (objM31228b instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) objM31228b);
            } else if (objM31228b instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) objM31228b);
            } else if (objM31228b instanceof char[]) {
                bundle.putCharArray(str, (char[]) objM31228b);
            } else if (objM31228b instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) objM31228b);
            } else if (objM31228b instanceof float[]) {
                bundle.putFloatArray(str, (float[]) objM31228b);
            } else if (objM31228b instanceof int[]) {
                bundle.putIntArray(str, (int[]) objM31228b);
            } else if (objM31228b instanceof long[]) {
                bundle.putLongArray(str, (long[]) objM31228b);
            } else if (objM31228b instanceof short[]) {
                bundle.putShortArray(str, (short[]) objM31228b);
            } else if (objM31228b instanceof Object[]) {
                Class<?> componentType = objM31228b.getClass().getComponentType();
                sq8.m48646e(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    sq8.m48647f(objM31228b, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle.putParcelableArray(str, (Parcelable[]) objM31228b);
                } else if (String.class.isAssignableFrom(componentType)) {
                    sq8.m48647f(objM31228b, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle.putStringArray(str, (String[]) objM31228b);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    sq8.m48647f(objM31228b, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle.putCharSequenceArray(str, (CharSequence[]) objM31228b);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + TokenParser.DQUOTE);
                    }
                    bundle.putSerializable(str, (Serializable) objM31228b);
                }
            } else if (objM31228b instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) objM31228b);
            } else if (objM31228b instanceof IBinder) {
                bundle.putBinder(str, (IBinder) objM31228b);
            } else if (objM31228b instanceof Size) {
                en1.m25348a(bundle, str, (Size) objM31228b);
            } else {
                if (!(objM31228b instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + objM31228b.getClass().getCanonicalName() + " for key \"" + str + TokenParser.DQUOTE);
                }
                en1.m25349b(bundle, str, (SizeF) objM31228b);
            }
        }
        return bundle;
    }
}

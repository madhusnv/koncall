package p001o;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* loaded from: classes2.dex */
public abstract class twd {

    /* renamed from: o.twd$a */
    public static class C17246a {
        /* renamed from: a */
        public static <V> PropertyValuesHolder m50732a(Property<?, V> property, Path path) {
            return PropertyValuesHolder.ofObject(property, (TypeConverter) null, path);
        }
    }

    /* renamed from: a */
    public static PropertyValuesHolder m50731a(Property property, Path path) {
        return C17246a.m50732a(property, path);
    }
}

package p001o;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* loaded from: classes2.dex */
public abstract class f6c {

    /* renamed from: o.f6c$a */
    public static class C13350a {
        /* renamed from: a */
        public static <T, V> ObjectAnimator m26210a(T t, Property<T, V> property, Path path) {
            return ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
        }
    }

    /* renamed from: a */
    public static ObjectAnimator m26209a(Object obj, Property property, Path path) {
        return C13350a.m26210a(obj, property, path);
    }
}

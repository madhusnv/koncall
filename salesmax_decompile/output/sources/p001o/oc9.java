package p001o;

import android.view.KeyEvent;

/* loaded from: classes2.dex */
public final class oc9 {

    /* renamed from: a */
    public final KeyEvent f38116a;

    public /* synthetic */ oc9(KeyEvent keyEvent) {
        this.f38116a = keyEvent;
    }

    /* renamed from: a */
    public static final /* synthetic */ oc9 m41964a(KeyEvent keyEvent) {
        return new oc9(keyEvent);
    }

    /* renamed from: b */
    public static KeyEvent m41965b(KeyEvent keyEvent) {
        sq8.m48649h(keyEvent, "nativeKeyEvent");
        return keyEvent;
    }

    /* renamed from: c */
    public static boolean m41966c(KeyEvent keyEvent, Object obj) {
        return (obj instanceof oc9) && sq8.m48644c(keyEvent, ((oc9) obj).m41969f());
    }

    /* renamed from: d */
    public static int m41967d(KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    /* renamed from: e */
    public static String m41968e(KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + ')';
    }

    public boolean equals(Object obj) {
        return m41966c(this.f38116a, obj);
    }

    /* renamed from: f */
    public final /* synthetic */ KeyEvent m41969f() {
        return this.f38116a;
    }

    public int hashCode() {
        return m41967d(this.f38116a);
    }

    public String toString() {
        return m41968e(this.f38116a);
    }
}

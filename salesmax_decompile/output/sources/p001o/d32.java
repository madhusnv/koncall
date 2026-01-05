package p001o;

import android.content.Intent;

/* loaded from: classes5.dex */
public interface d32 {

    /* renamed from: o.d32$a */
    public static final class C12789a {

        /* renamed from: a */
        public final int f19059a;

        /* renamed from: b */
        public final int f19060b;

        /* renamed from: c */
        public final Intent f19061c;

        public C12789a(int i, int i2, Intent intent) {
            this.f19059a = i;
            this.f19060b = i2;
            this.f19061c = intent;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12789a)) {
                return false;
            }
            C12789a c12789a = (C12789a) obj;
            return this.f19059a == c12789a.f19059a && this.f19060b == c12789a.f19060b && sq8.m48644c(this.f19061c, c12789a.f19061c);
        }

        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.f19059a) * 31) + Integer.hashCode(this.f19060b)) * 31;
            Intent intent = this.f19061c;
            return iHashCode + (intent == null ? 0 : intent.hashCode());
        }

        public String toString() {
            return "ActivityResultParameters(requestCode=" + this.f19059a + ", resultCode=" + this.f19060b + ", data=" + this.f19061c + ')';
        }
    }

    /* renamed from: o.d32$b */
    public static final class C12790b {

        /* renamed from: a */
        public static final C12790b f19062a = new C12790b();

        /* renamed from: a */
        public static final d32 m22294a() {
            return new e32();
        }
    }

    /* renamed from: a */
    boolean mo22293a(int i, int i2, Intent intent);
}

package p001o;

import android.os.Build;
import android.os.Bundle;

/* loaded from: classes2.dex */
public class m8b {

    /* renamed from: a */
    public final int f34965a;

    /* renamed from: b */
    public final boolean f34966b;

    /* renamed from: c */
    public final boolean f34967c;

    /* renamed from: d */
    public final boolean f34968d;

    /* renamed from: e */
    public final Bundle f34969e;

    /* renamed from: o.m8b$a */
    public static final class C15251a {

        /* renamed from: a */
        public int f34970a = 1;

        /* renamed from: b */
        public boolean f34971b;

        /* renamed from: c */
        public boolean f34972c;

        /* renamed from: d */
        public boolean f34973d;

        /* renamed from: e */
        public Bundle f34974e;

        public C15251a() {
            this.f34971b = Build.VERSION.SDK_INT >= 30;
        }

        /* renamed from: a */
        public m8b m38560a() {
            return new m8b(this);
        }

        /* renamed from: b */
        public C15251a m38561b(boolean z) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f34971b = z;
            }
            return this;
        }

        /* renamed from: c */
        public C15251a m38562c(boolean z) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f34972c = z;
            }
            return this;
        }

        /* renamed from: d */
        public C15251a m38563d(boolean z) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f34973d = z;
            }
            return this;
        }
    }

    public m8b(C15251a c15251a) {
        this.f34965a = c15251a.f34970a;
        this.f34966b = c15251a.f34971b;
        this.f34967c = c15251a.f34972c;
        this.f34968d = c15251a.f34973d;
        Bundle bundle = c15251a.f34974e;
        this.f34969e = bundle == null ? Bundle.EMPTY : new Bundle(bundle);
    }

    /* renamed from: a */
    public int m38555a() {
        return this.f34965a;
    }

    /* renamed from: b */
    public Bundle m38556b() {
        return this.f34969e;
    }

    /* renamed from: c */
    public boolean m38557c() {
        return this.f34966b;
    }

    /* renamed from: d */
    public boolean m38558d() {
        return this.f34967c;
    }

    /* renamed from: e */
    public boolean m38559e() {
        return this.f34968d;
    }
}

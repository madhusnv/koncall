package p001o;

import android.media.VolumeProvider;
import android.os.Build;

/* loaded from: classes2.dex */
public abstract class m2j {

    /* renamed from: a */
    public final int f34675a;

    /* renamed from: b */
    public final int f34676b;

    /* renamed from: c */
    public final String f34677c;

    /* renamed from: d */
    public int f34678d;

    /* renamed from: e */
    public AbstractC15208d f34679e;

    /* renamed from: f */
    public VolumeProvider f34680f;

    /* renamed from: o.m2j$a */
    public class C15205a extends VolumeProvider {
        public C15205a(int i, int i2, int i3, String str) {
            super(i, i2, i3, str);
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i) {
            m2j.this.mo8314b(i);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i) {
            m2j.this.mo8315c(i);
        }
    }

    /* renamed from: o.m2j$b */
    public class C15206b extends VolumeProvider {
        public C15206b(int i, int i2, int i3) {
            super(i, i2, i3);
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i) {
            m2j.this.mo8314b(i);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i) {
            m2j.this.mo8315c(i);
        }
    }

    /* renamed from: o.m2j$c */
    public static class C15207c {
        /* renamed from: a */
        public static void m38224a(VolumeProvider volumeProvider, int i) {
            volumeProvider.setCurrentVolume(i);
        }
    }

    /* renamed from: o.m2j$d */
    public static abstract class AbstractC15208d {
        /* renamed from: a */
        public abstract void m38225a(m2j m2jVar);
    }

    public m2j(int i, int i2, int i3, String str) {
        this.f34675a = i;
        this.f34676b = i2;
        this.f34678d = i3;
        this.f34677c = str;
    }

    /* renamed from: a */
    public Object m38222a() {
        if (this.f34680f == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f34680f = new C15205a(this.f34675a, this.f34676b, this.f34678d, this.f34677c);
            } else {
                this.f34680f = new C15206b(this.f34675a, this.f34676b, this.f34678d);
            }
        }
        return this.f34680f;
    }

    /* renamed from: b */
    public abstract void mo8314b(int i);

    /* renamed from: c */
    public abstract void mo8315c(int i);

    /* renamed from: d */
    public final void m38223d(int i) {
        this.f34678d = i;
        C15207c.m38224a((VolumeProvider) m38222a(), i);
        AbstractC15208d abstractC15208d = this.f34679e;
        if (abstractC15208d != null) {
            abstractC15208d.m38225a(this);
        }
    }
}

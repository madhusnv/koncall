package androidx.camera.core;

import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.InterfaceC1893c;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p001o.jd8;

/* renamed from: androidx.camera.core.b */
/* loaded from: classes2.dex */
public abstract class AbstractC1892b implements InterfaceC1893c {

    /* renamed from: b */
    public final InterfaceC1893c f6096b;

    /* renamed from: a */
    public final Object f6095a = new Object();

    /* renamed from: c */
    public final Set f6097c = new HashSet();

    /* renamed from: androidx.camera.core.b$a */
    public interface a {
        /* renamed from: b */
        void mo4662b(InterfaceC1893c interfaceC1893c);
    }

    public AbstractC1892b(InterfaceC1893c interfaceC1893c) {
        this.f6096b = interfaceC1893c;
    }

    @Override // androidx.camera.core.InterfaceC1893c
    public void C0(Rect rect) {
        this.f6096b.C0(rect);
    }

    @Override // androidx.camera.core.InterfaceC1893c
    public Image J2() {
        return this.f6096b.J2();
    }

    /* renamed from: a */
    public void m4660a(a aVar) {
        synchronized (this.f6095a) {
            this.f6097c.add(aVar);
        }
    }

    /* renamed from: c */
    public void m4661c() {
        HashSet hashSet;
        synchronized (this.f6095a) {
            hashSet = new HashSet(this.f6097c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((a) it.next()).mo4662b(this);
        }
    }

    @Override // androidx.camera.core.InterfaceC1893c, java.lang.AutoCloseable
    public void close() {
        this.f6096b.close();
        m4661c();
    }

    @Override // androidx.camera.core.InterfaceC1893c
    public int getHeight() {
        return this.f6096b.getHeight();
    }

    @Override // androidx.camera.core.InterfaceC1893c
    public int getWidth() {
        return this.f6096b.getWidth();
    }

    @Override // androidx.camera.core.InterfaceC1893c
    /* renamed from: l */
    public int mo4657l() {
        return this.f6096b.mo4657l();
    }

    @Override // androidx.camera.core.InterfaceC1893c
    public InterfaceC1893c.a[] u1() {
        return this.f6096b.u1();
    }

    @Override // androidx.camera.core.InterfaceC1893c
    public jd8 y2() {
        return this.f6096b.y2();
    }
}

package h0;

import a1.C0005d;
import a1.RunnableC0024w;
import al.C0174b;
import androidx.camera.core.ImageCaptureException;
import be.C0655j;
import c0.c0;
import c0.d0;
import c9.C0919n;
import com.sun.mail.util.AbstractC1452a;
import i0.d1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import og.y0;
import pg.o7;
import pg.t8;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h0.d */
/* loaded from: classes.dex */
public final class C2764d implements c0 {

    /* renamed from: b */
    public C0919n f15333b;

    /* renamed from: c */
    public final ArrayList f15334c;

    /* renamed from: a */
    public final ArrayDeque f15332a = new ArrayDeque();

    /* renamed from: d */
    public boolean f15335d = false;

    public C2764d(C0174b c0174b) {
        o7.m11806a();
        this.f15334c = new ArrayList();
    }

    /* renamed from: a */
    public final void m6755a() {
        o7.m11806a();
        new ImageCaptureException("Camera is closed.", null);
        ArrayDeque arrayDeque = this.f15332a;
        Iterator it = arrayDeque.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        arrayDeque.clear();
        ArrayList arrayList = new ArrayList(this.f15334c);
        if (arrayList.size() <= 0) {
            return;
        }
        AbstractC1452a.m4578y(arrayList.get(0));
        throw null;
    }

    /* renamed from: b */
    public final void m6756b() {
        int iMo1884z;
        o7.m11806a();
        if (this.f15335d) {
            return;
        }
        C0919n c0919n = this.f15333b;
        c0919n.getClass();
        o7.m11806a();
        C0005d c0005d = (C0005d) c0919n.f5599b;
        c0005d.getClass();
        o7.m11806a();
        y0.m11056f("The ImageReader is not initialized.", ((C0655j) c0005d.f24b) != null);
        C0655j c0655j = (C0655j) c0005d.f24b;
        synchronized (c0655j.f4193c) {
            iMo1884z = ((d1) c0655j.f4194d).mo1884z() - c0655j.f4191a;
        }
        if (iMo1884z != 0 && this.f15332a.poll() != null) {
            throw new ClassCastException();
        }
    }

    @Override // c0.c0
    /* renamed from: c */
    public final void mo2178c(d0 d0Var) {
        t8.m11875d().execute(new RunnableC0024w(17, this));
    }
}

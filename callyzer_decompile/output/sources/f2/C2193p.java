package f2;

import a1.C0005d;
import al.AbstractC0180h;
import android.content.Context;
import android.media.Image;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import bg.AbstractC0656a;
import c3.C0847b;
import c3.C0850e;
import c9.C0927v;
import cg.BinderC0969b;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.internal.measurement.j4;
import com.google.mlkit.common.MlKitException;
import com.skydoves.balloon.internals.DefinitionKt;
import d3.C1565s;
import dg.C1716e;
import dr.C1770t;
import e1.C1915q;
import el.C2066a;
import ex.InterfaceC2137a;
import f3.C2196b;
import f3.InterfaceC2198d;
import gl.AbstractC2625a;
import gl.InterfaceC2630f;
import h1.AbstractC2773d;
import h1.AbstractC2793x;
import h1.C2772c;
import h1.w1;
import hl.C2964a;
import i0.m0;
import java.util.ArrayList;
import k4.C4001v;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import m1.C4619a;
import m1.C4620b;
import m1.C4621c;
import m1.C4622d;
import m1.C4623e;
import m1.C4626h;
import m1.C4627i;
import m1.InterfaceC4628j;
import nf.C5047i;
import ng.AbstractC5053d;
import ng.C5051b;
import ng.C5056g;
import og.AbstractBinderC5364e;
import og.AbstractC5377r;
import og.C5361b;
import og.C5362c;
import og.C5363d;
import og.C5366g;
import og.InterfaceC5365f;
import og.ec;
import og.v1;
import og.we;
import og.yg;
import p3.AbstractC5818p;
import p3.C5805c;
import p3.C5819q;
import pf.C5904d;
import pg.s6;
import rw.AbstractC6663m;
import sf.AbstractC6840z;
import tx.InterfaceC7266z;
import tx.c0;
import uw.InterfaceC7559c;
import v3.C7647s;
import v3.g0;
import v3.i0;
import w3.C7904v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f2.p */
/* loaded from: classes.dex */
public final class C2193p implements InterfaceC2630f {

    /* renamed from: a */
    public boolean f10110a;

    /* renamed from: b */
    public Object f10111b;

    /* renamed from: c */
    public Object f10112c = AbstractC2773d.m6778a(DefinitionKt.NO_Float_VALUE);

    /* renamed from: d */
    public Object f10113d = new ArrayList();

    /* renamed from: e */
    public Object f10114e;

    /* JADX WARN: Multi-variable type inference failed */
    public C2193p(boolean z6, InterfaceC2137a interfaceC2137a) {
        this.f10110a = z6;
        this.f10111b = (AbstractC4155m) interfaceC2137a;
    }

    @Override // gl.InterfaceC2630f
    /* renamed from: a */
    public ArrayList mo5889a(C2964a c2964a) throws MlKitException {
        we[] weVarArrM10568U;
        if (((C5362c) this.f10114e) == null) {
            mo5890b();
        }
        C5362c c5362c = (C5362c) this.f10114e;
        if (c5362c == null) {
            throw new MlKitException("Error initializing the legacy barcode scanner.", 14);
        }
        C5366g c5366g = new C5366g(c2964a.f16025c, c2964a.f16026d, 0, s6.m11857b(c2964a.f16027e), 0L);
        try {
            int i10 = c2964a.f16028f;
            int i11 = 17;
            if (i10 == -1) {
                BinderC0969b binderC0969b = new BinderC0969b(c2964a.f16023a);
                Parcel parcelM3750Q = c5362c.m3750Q();
                int i12 = AbstractC5377r.f26775a;
                parcelM3750Q.writeStrongBinder(binderC0969b);
                parcelM3750Q.writeInt(1);
                c5366g.writeToParcel(parcelM3750Q, 0);
                Parcel parcelM3751R = c5362c.m3751R(parcelM3750Q, 2);
                we[] weVarArr = (we[]) parcelM3751R.createTypedArray(we.CREATOR);
                parcelM3751R.recycle();
                weVarArrM10568U = weVarArr;
            } else if (i10 == 17) {
                weVarArrM10568U = c5362c.m10568U(new BinderC0969b(null), c5366g);
            } else if (i10 == 35) {
                Image.Plane[] planeArrM7245a = c2964a.m7245a();
                AbstractC6840z.m13036g(planeArrM7245a);
                c5366g.f26449a = planeArrM7245a[0].getRowStride();
                weVarArrM10568U = c5362c.m10568U(new BinderC0969b(planeArrM7245a[0].getBuffer()), c5366g);
            } else {
                if (i10 != 842094169) {
                    throw new MlKitException("Unsupported image format: " + c2964a.f16028f, 3);
                }
                weVarArrM10568U = c5362c.m10568U(new BinderC0969b(AbstractC0656a.m1899h(c2964a)), c5366g);
            }
            ArrayList arrayList = new ArrayList();
            for (we weVar : weVarArrM10568U) {
                arrayList.add(new C2066a(new C5047i(i11, weVar)));
            }
            return arrayList;
        } catch (RemoteException e2) {
            throw new MlKitException("Failed to detect with legacy barcode detector", e2);
        }
    }

    @Override // gl.InterfaceC2630f
    /* renamed from: b */
    public boolean mo5890b() throws MlKitException {
        InterfaceC5365f c5363d;
        yg ygVar = (yg) this.f10113d;
        Context context = (Context) this.f10111b;
        if (((C5362c) this.f10114e) != null) {
            return false;
        }
        try {
            IBinder iBinderM5410b = C1716e.m5404c(context, C1716e.f8343b, "com.google.android.gms.vision.dynamite").m5410b("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator");
            int i10 = AbstractBinderC5364e.f26385f;
            if (iBinderM5410b == null) {
                c5363d = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinderM5410b.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
                c5363d = iInterfaceQueryLocalInterface instanceof InterfaceC5365f ? (InterfaceC5365f) iInterfaceQueryLocalInterface : new C5363d(iBinderM5410b, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator", 4);
            }
            C5362c c5362cM10594U = ((C5363d) c5363d).m10594U(new BinderC0969b(context), (C5361b) this.f10112c);
            this.f10114e = c5362cM10594U;
            if (c5362cM10594U == null && !this.f10110a) {
                C5904d[] c5904dArr = AbstractC0180h.f548a;
                C5051b c5051b = AbstractC5053d.f24831b;
                Object[] objArr = {"barcode"};
                v1.m11011a(1, objArr);
                AbstractC0180h.m407a(context, new C5056g(1, objArr));
                this.f10110a = true;
                AbstractC2625a.m6598b(ygVar, ec.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            AbstractC2625a.m6598b(ygVar, ec.NO_ERROR);
            return false;
        } catch (RemoteException e2) {
            throw new MlKitException("Failed to create legacy barcode detector.", e2);
        } catch (DynamiteModule$LoadingException e10) {
            throw new MlKitException("Failed to load deprecated vision dynamite module.", e10);
        }
    }

    @Override // gl.InterfaceC2630f
    /* renamed from: c */
    public void mo5891c() {
        C5362c c5362c = (C5362c) this.f10114e;
        if (c5362c != null) {
            try {
                c5362c.m3752S(c5362c.m3750Q(), 3);
            } catch (RemoteException unused) {
            }
            this.f10114e = null;
        }
    }

    /* renamed from: d */
    public void m5892d(i0 i0Var, float f6, long j6) {
        C2196b c2196b = i0Var.f36917a;
        float fFloatValue = ((Number) ((C2772c) this.f10112c).m6775d()).floatValue();
        if (fFloatValue > DefinitionKt.NO_Float_VALUE) {
            long jM5186b = C1565s.m5186b(fFloatValue, 14, j6);
            if (!this.f10110a) {
                InterfaceC2198d.m5910q(i0Var, jM5186b, f6, 0L, null, 0, 124);
                return;
            }
            float fM2293d = C0850e.m2293d(c2196b.mo5913e());
            float fM2291b = C0850e.m2291b(c2196b.mo5913e());
            C0005d c0005d = c2196b.f10124b;
            long jM81z = c0005d.m81z();
            c0005d.m75t().mo5107i();
            try {
                ((C0005d) ((C5047i) c0005d.f24b).f24823b).m75t().mo5111m(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, fM2293d, fM2291b, 1);
                InterfaceC2198d.m5910q(i0Var, jM5186b, f6, 0L, null, 0, 124);
            } finally {
                m0.m7392y(c0005d, jM81z);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [ex.a, kotlin.jvm.internal.m] */
    /* renamed from: e */
    public void m5893e(InterfaceC4628j interfaceC4628j, InterfaceC7266z interfaceC7266z) {
        ArrayList arrayList = (ArrayList) this.f10113d;
        boolean z6 = interfaceC4628j instanceof C4626h;
        if (z6) {
            arrayList.add(interfaceC4628j);
        } else if (interfaceC4628j instanceof C4627i) {
            arrayList.remove(((C4627i) interfaceC4628j).f22872a);
        } else if (interfaceC4628j instanceof C4622d) {
            arrayList.add(interfaceC4628j);
        } else if (interfaceC4628j instanceof C4623e) {
            arrayList.remove(((C4623e) interfaceC4628j).f22864a);
        } else if (interfaceC4628j instanceof C4620b) {
            arrayList.add(interfaceC4628j);
        } else if (interfaceC4628j instanceof C4621c) {
            arrayList.remove(((C4621c) interfaceC4628j).f22863a);
        } else if (!(interfaceC4628j instanceof C4619a)) {
            return;
        } else {
            arrayList.remove(((C4619a) interfaceC4628j).f22862a);
        }
        InterfaceC4628j interfaceC4628j2 = (InterfaceC4628j) AbstractC6663m.m12751O(arrayList);
        if (AbstractC4154l.m8918a((InterfaceC4628j) this.f10114e, interfaceC4628j2)) {
            return;
        }
        InterfaceC7559c interfaceC7559c = null;
        if (interfaceC4628j2 != null) {
            C2182e c2182e = (C2182e) ((AbstractC4155m) this.f10111b).invoke();
            float f6 = z6 ? c2182e.f10083c : interfaceC4628j instanceof C4622d ? c2182e.f10082b : interfaceC4628j instanceof C4620b ? c2182e.f10081a : DefinitionKt.NO_Float_VALUE;
            w1 w1Var = AbstractC2188k.f10100a;
            if (!(interfaceC4628j2 instanceof C4626h) && ((interfaceC4628j2 instanceof C4622d) || (interfaceC4628j2 instanceof C4620b))) {
                w1Var = new w1(45, AbstractC2793x.f15642d, 2);
            }
            c0.m13502y(interfaceC7266z, null, null, new C2192o(this, f6, w1Var, (InterfaceC7559c) null), 3);
        } else {
            InterfaceC4628j interfaceC4628j3 = (InterfaceC4628j) this.f10114e;
            w1 w1Var2 = AbstractC2188k.f10100a;
            if (!(interfaceC4628j3 instanceof C4626h) && !(interfaceC4628j3 instanceof C4622d) && (interfaceC4628j3 instanceof C4620b)) {
                w1Var2 = new w1(150, AbstractC2793x.f15642d, 2);
            }
            c0.m13502y(interfaceC7266z, null, null, new C1770t(this, w1Var2, interfaceC7559c, 9), 3);
        }
        this.f10114e = interfaceC4628j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public int m5894f(C0927v c0927v, C7904v c7904v, boolean z6) {
        Object[] objArr;
        int i10;
        C5805c c5805c = (C5805c) this.f10112c;
        C7647s c7647s = (C7647s) this.f10114e;
        if (this.f10110a) {
            return 0;
        }
        try {
            this.f10110a = true;
            j4 j4VarM8778s = ((C4001v) this.f10113d).m8778s(c0927v, c7904v);
            C1915q c1915q = (C1915q) j4VarM8778s.f6252c;
            int iM5603g = c1915q.m5603g();
            for (int i11 = 0; i11 < iM5603g; i11++) {
                C5819q c5819q = (C5819q) c1915q.m5604i(i11);
                if (!c5819q.f28479d && !c5819q.f28483h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int iM5603g2 = c1915q.m5603g();
            for (int i12 = 0; i12 < iM5603g2; i12++) {
                C5819q c5819q2 = (C5819q) c1915q.m5604i(i12);
                if (objArr != false || AbstractC5818p.m11397a(c5819q2)) {
                    ((g0) this.f10111b).m14571A(c5819q2.f28478c, (C7647s) this.f10114e, c5819q2.f28484i, true);
                    if (!c7647s.f36988a.m5549g()) {
                        c5805c.m11375a(c5819q2.f28476a, c7647s, AbstractC5818p.m11397a(c5819q2));
                        c7647s.clear();
                    }
                }
            }
            boolean zM11378d = c5805c.m11378d(j4VarM8778s, z6);
            if (j4VarM8778s.f6251b) {
                i10 = 0;
            } else {
                int iM5603g3 = c1915q.m5603g();
                for (int i13 = 0; i13 < iM5603g3; i13++) {
                    C5819q c5819q3 = (C5819q) c1915q.m5604i(i13);
                    if (!C0847b.m2271b(AbstractC5818p.m11403g(c5819q3, true), 0L) && c5819q3.m11406b()) {
                        i10 = 1;
                        break;
                    }
                }
                i10 = 0;
            }
            int i14 = (zM11378d ? 1 : 0) | (i10 << 1);
            this.f10110a = false;
            return i14;
        } catch (Throwable th2) {
            this.f10110a = false;
            throw th2;
        }
    }
}

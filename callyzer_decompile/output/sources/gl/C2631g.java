package gl;

import al.AbstractC0180h;
import al.C0189q;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import cg.BinderC0969b;
import cl.C0982b;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.mlkit.common.MlKitException;
import dg.C1716e;
import dg.InterfaceC1715d;
import el.C2066a;
import hl.C2964a;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import mm.AbstractC4801l;
import og.AbstractC5377r;
import og.C5384y;
import og.a0;
import og.e0;
import og.ec;
import og.ph;
import og.qh;
import og.rh;
import og.sh;
import og.th;
import og.yg;
import pf.C5904d;
import pf.C5906f;
import pg.AbstractC5932m;
import pg.l8;
import pg.s6;
import qf.C6205d;
import qf.InterfaceC6203b;
import sf.AbstractC6840z;
import wf.C8025a;
import xf.C8372g;
import yg.AbstractC8651h;
import yg.C8656m;
import yk.C8687a;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gl.g */
/* loaded from: classes.dex */
public final class C2631g implements InterfaceC2630f {

    /* renamed from: g */
    public static final e0 f14219g;

    /* renamed from: a */
    public boolean f14220a;

    /* renamed from: b */
    public boolean f14221b;

    /* renamed from: c */
    public boolean f14222c;

    /* renamed from: d */
    public final Context f14223d;

    /* renamed from: e */
    public final yg f14224e;

    /* renamed from: f */
    public qh f14225f;

    static {
        C5384y c5384y = a0.f26308b;
        Object[] objArr = {"com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite"};
        for (int i10 = 0; i10 < 2; i10++) {
            if (objArr[i10] == null) {
                throw new NullPointerException(AbstractC4801l.m9730d(i10, "at index "));
            }
        }
        f14219g = new e0(2, objArr);
    }

    public C2631g(Context context, C0982b c0982b, yg ygVar) {
        this.f14223d = context;
        this.f14224e = ygVar;
    }

    @Override // gl.InterfaceC2630f
    /* renamed from: a */
    public final ArrayList mo5889a(C2964a c2964a) throws Throwable {
        BinderC0969b binderC0969b;
        if (this.f14225f == null) {
            mo5890b();
        }
        qh qhVar = this.f14225f;
        AbstractC6840z.m13036g(qhVar);
        if (!this.f14220a) {
            try {
                qhVar.m3752S(qhVar.m3750Q(), 1);
                this.f14220a = true;
            } catch (RemoteException e2) {
                throw new MlKitException("Failed to init barcode scanner.", e2);
            }
        }
        int rowStride = c2964a.f16025c;
        int i10 = 0;
        if (c2964a.f16028f == 35) {
            Image.Plane[] planeArrM7245a = c2964a.m7245a();
            AbstractC6840z.m13036g(planeArrM7245a);
            rowStride = planeArrM7245a[0].getRowStride();
        }
        int i11 = c2964a.f16028f;
        int i12 = c2964a.f16026d;
        int iM11857b = s6.m11857b(c2964a.f16027e);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i13 = c2964a.f16028f;
        if (i13 != -1) {
            if (i13 != 17) {
                if (i13 == 35) {
                    binderC0969b = new BinderC0969b(c2964a.f16024b != null ? (Image) c2964a.f16024b.f43336b : null);
                } else if (i13 != 842094169) {
                    throw new MlKitException(AbstractC4801l.m9730d(c2964a.f16028f, "Unsupported image format: "), 3);
                }
            }
            AbstractC6840z.m13036g(null);
            throw null;
        }
        Bitmap bitmap = c2964a.f16023a;
        AbstractC6840z.m13036g(bitmap);
        binderC0969b = new BinderC0969b(bitmap);
        try {
            Parcel parcelM3750Q = qhVar.m3750Q();
            int i14 = AbstractC5377r.f26775a;
            parcelM3750Q.writeStrongBinder(binderC0969b);
            parcelM3750Q.writeInt(1);
            int iM11783k = AbstractC5932m.m11783k(parcelM3750Q, 20293);
            AbstractC5932m.m11785m(parcelM3750Q, 1, 4);
            parcelM3750Q.writeInt(i11);
            AbstractC5932m.m11785m(parcelM3750Q, 2, 4);
            parcelM3750Q.writeInt(rowStride);
            AbstractC5932m.m11785m(parcelM3750Q, 3, 4);
            parcelM3750Q.writeInt(i12);
            AbstractC5932m.m11785m(parcelM3750Q, 4, 4);
            parcelM3750Q.writeInt(iM11857b);
            AbstractC5932m.m11785m(parcelM3750Q, 5, 8);
            parcelM3750Q.writeLong(jElapsedRealtime);
            AbstractC5932m.m11784l(parcelM3750Q, iM11783k);
            Parcel parcelM3751R = qhVar.m3751R(parcelM3750Q, 3);
            ArrayList arrayListCreateTypedArrayList = parcelM3751R.createTypedArrayList(ph.CREATOR);
            parcelM3751R.recycle();
            ArrayList arrayList = new ArrayList();
            int size = arrayListCreateTypedArrayList.size();
            while (i10 < size) {
                Object obj = arrayListCreateTypedArrayList.get(i10);
                i10++;
                arrayList.add(new C2066a(new C8989c(14, (ph) obj)));
            }
            return arrayList;
        } catch (RemoteException e10) {
            throw new MlKitException("Failed to run barcode scanner.", e10);
        }
    }

    @Override // gl.InterfaceC2630f
    /* renamed from: b */
    public final boolean mo5890b() throws Throwable {
        boolean z6;
        if (this.f14225f != null) {
            return this.f14221b;
        }
        Context context = this.f14223d;
        int iM5403a = C1716e.m5403a(context, ModuleDescriptor.MODULE_ID);
        yg ygVar = this.f14224e;
        int i10 = 1;
        if (iM5403a > 0) {
            this.f14221b = true;
            try {
                this.f14225f = m6603d(C1716e.f8344c, ModuleDescriptor.MODULE_ID, "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (RemoteException e2) {
                throw new MlKitException("Failed to create thick barcode scanner.", e2);
            } catch (DynamiteModule$LoadingException e10) {
                throw new MlKitException("Failed to load the bundled barcode module.", e10);
            }
        } else {
            this.f14221b = false;
            C5904d[] c5904dArr = AbstractC0180h.f548a;
            C5906f.f28748b.getClass();
            int iM11514a = C5906f.m11514a(context);
            e0 e0Var = f14219g;
            if (iM11514a >= 221500000) {
                try {
                    C8656m c8656mM15542c = new C8372g(context, null, C8372g.f40031k, InterfaceC6203b.R0, C6205d.f30184c).m15542c(new C0189q(AbstractC0180h.m408b(AbstractC0180h.f551d, e0Var), 1));
                    C8687a c8687a = new C8687a(i10);
                    c8656mM15542c.getClass();
                    c8656mM15542c.m15977d(AbstractC8651h.f41931a, c8687a);
                    z6 = ((C8025a) l8.m11760a(c8656mM15542c)).f38542a;
                } catch (DynamiteModule$LoadingException | InterruptedException | ExecutionException unused) {
                    z6 = false;
                }
            } else {
                C5384y c5384yListIterator = e0Var.listIterator(0);
                while (c5384yListIterator.hasNext()) {
                    C1716e.m5404c(context, C1716e.f8343b, (String) c5384yListIterator.next());
                }
                z6 = true;
            }
            if (!z6) {
                if (!this.f14222c) {
                    Object[] objArr = {"barcode", "tflite_dynamite"};
                    for (int i11 = 0; i11 < 2; i11++) {
                        if (objArr[i11] == null) {
                            throw new NullPointerException(AbstractC4801l.m9730d(i11, "at index "));
                        }
                    }
                    AbstractC0180h.m407a(context, new e0(2, objArr));
                    this.f14222c = true;
                }
                AbstractC2625a.m6598b(ygVar, ec.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            try {
                this.f14225f = m6603d(C1716e.f8343b, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (RemoteException | DynamiteModule$LoadingException e11) {
                AbstractC2625a.m6598b(ygVar, ec.OPTIONAL_MODULE_INIT_ERROR);
                throw new MlKitException("Failed to create thin barcode scanner.", e11);
            }
        }
        AbstractC2625a.m6598b(ygVar, ec.NO_ERROR);
        return this.f14221b;
    }

    @Override // gl.InterfaceC2630f
    /* renamed from: c */
    public final void mo5891c() {
        qh qhVar = this.f14225f;
        if (qhVar != null) {
            try {
                qhVar.m3752S(qhVar.m3750Q(), 2);
            } catch (RemoteException unused) {
            }
            this.f14225f = null;
            this.f14220a = false;
        }
    }

    /* renamed from: d */
    public final qh m6603d(InterfaceC1715d interfaceC1715d, String str, String str2) throws DynamiteModule$LoadingException {
        th rhVar;
        Context context = this.f14223d;
        IBinder iBinderM5410b = C1716e.m5404c(context, interfaceC1715d, str).m5410b(str2);
        int i10 = sh.f26805f;
        qh qhVar = null;
        if (iBinderM5410b == null) {
            rhVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinderM5410b.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
            rhVar = iInterfaceQueryLocalInterface instanceof th ? (th) iInterfaceQueryLocalInterface : new rh(iBinderM5410b, "com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator", 4);
        }
        BinderC0969b binderC0969b = new BinderC0969b(context);
        rh rhVar2 = (rh) rhVar;
        Parcel parcelM3750Q = rhVar2.m3750Q();
        int i11 = AbstractC5377r.f26775a;
        parcelM3750Q.writeStrongBinder(binderC0969b);
        parcelM3750Q.writeInt(1);
        int iM11783k = AbstractC5932m.m11783k(parcelM3750Q, 20293);
        AbstractC5932m.m11785m(parcelM3750Q, 1, 4);
        parcelM3750Q.writeInt(0);
        AbstractC5932m.m11785m(parcelM3750Q, 2, 4);
        parcelM3750Q.writeInt(0);
        AbstractC5932m.m11784l(parcelM3750Q, iM11783k);
        Parcel parcelM3751R = rhVar2.m3751R(parcelM3750Q, 1);
        IBinder strongBinder = parcelM3751R.readStrongBinder();
        if (strongBinder != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
            qhVar = iInterfaceQueryLocalInterface2 instanceof qh ? (qh) iInterfaceQueryLocalInterface2 : new qh(strongBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScanner", 4);
        }
        parcelM3751R.recycle();
        return qhVar;
    }
}

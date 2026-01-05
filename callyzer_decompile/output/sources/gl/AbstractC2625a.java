package gl;

import al.C0178f;
import android.content.Context;
import android.util.SparseArray;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import dg.C1716e;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import og.e0;
import og.ec;
import og.fc;
import og.oc;
import og.pc;
import og.pg;
import og.yg;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gl.a */
/* loaded from: classes.dex */
public abstract class AbstractC2625a {

    /* renamed from: a */
    public static final SparseArray f14200a;

    /* renamed from: b */
    public static final SparseArray f14201b;

    /* renamed from: c */
    public static final AtomicReference f14202c;

    /* renamed from: d */
    public static final HashMap f14203d;

    static {
        SparseArray sparseArray = new SparseArray();
        f14200a = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        f14201b = sparseArray2;
        f14202c = new AtomicReference();
        sparseArray.put(-1, oc.FORMAT_UNKNOWN);
        sparseArray.put(1, oc.FORMAT_CODE_128);
        sparseArray.put(2, oc.FORMAT_CODE_39);
        sparseArray.put(4, oc.FORMAT_CODE_93);
        sparseArray.put(8, oc.FORMAT_CODABAR);
        sparseArray.put(16, oc.FORMAT_DATA_MATRIX);
        sparseArray.put(32, oc.FORMAT_EAN_13);
        sparseArray.put(64, oc.FORMAT_EAN_8);
        sparseArray.put(128, oc.FORMAT_ITF);
        sparseArray.put(256, oc.FORMAT_QR_CODE);
        sparseArray.put(512, oc.FORMAT_UPC_A);
        sparseArray.put(1024, oc.FORMAT_UPC_E);
        sparseArray.put(NewHope.SENDB_BYTES, oc.FORMAT_PDF417);
        sparseArray.put(4096, oc.FORMAT_AZTEC);
        sparseArray2.put(0, pc.TYPE_UNKNOWN);
        sparseArray2.put(1, pc.TYPE_CONTACT_INFO);
        sparseArray2.put(2, pc.TYPE_EMAIL);
        sparseArray2.put(3, pc.TYPE_ISBN);
        sparseArray2.put(4, pc.TYPE_PHONE);
        sparseArray2.put(5, pc.TYPE_PRODUCT);
        sparseArray2.put(6, pc.TYPE_SMS);
        sparseArray2.put(7, pc.TYPE_TEXT);
        sparseArray2.put(8, pc.TYPE_URL);
        sparseArray2.put(9, pc.TYPE_WIFI);
        sparseArray2.put(10, pc.TYPE_GEO);
        sparseArray2.put(11, pc.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, pc.TYPE_DRIVER_LICENSE);
        HashMap map = new HashMap();
        f14203d = map;
        map.put(1, pg.CODE_128);
        map.put(2, pg.CODE_39);
        map.put(4, pg.CODE_93);
        map.put(8, pg.CODABAR);
        map.put(16, pg.DATA_MATRIX);
        map.put(32, pg.EAN_13);
        map.put(64, pg.EAN_8);
        map.put(128, pg.ITF);
        map.put(256, pg.QR_CODE);
        map.put(512, pg.UPC_A);
        map.put(1024, pg.UPC_E);
        map.put(Integer.valueOf(NewHope.SENDB_BYTES), pg.PDF417);
        map.put(4096, pg.AZTEC);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static og.qg m6597a(cl.C0982b r4) {
        /*
            r4.getClass()
            mg.j0 r4 = new mg.j0
            r0 = 1
            r4.<init>(r0)
            java.util.HashMap r0 = gl.AbstractC2625a.f14203d
            java.util.Collection r0 = r0.values()
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L36
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            int r2 = r4.f23654a
            int r3 = r1.size()
            int r3 = r3 + r2
            r4.m9621b(r3)
            boolean r2 = r1 instanceof og.AbstractC5382w
            if (r2 != 0) goto L27
            goto L36
        L27:
            og.w r1 = (og.AbstractC5382w) r1
            java.lang.Object r0 = r4.f23656c
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r2 = r4.f23654a
            int r0 = r1.mo10520a(r2, r0)
            r4.f23654a = r0
            goto L48
        L36:
            java.util.Iterator r0 = r0.iterator()
        L3a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L48
            java.lang.Object r1 = r0.next()
            r4.m9620a(r1)
            goto L3a
        L48:
            l4.d0 r0 = new l4.d0
            r1 = 9
            r2 = 0
            r0.<init>(r1, r2)
            og.e0 r4 = r4.m9622c()
            r0.f21881b = r4
            og.qg r4 = new og.qg
            r4.<init>(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: gl.AbstractC2625a.m6597a(cl.b):og.qg");
    }

    /* renamed from: b */
    public static void m6598b(yg ygVar, ec ecVar) {
        ygVar.m11075b(new C8989c(13, ecVar), fc.ON_DEVICE_BARCODE_LOAD);
    }

    /* renamed from: c */
    public static boolean m6599c() {
        AtomicReference atomicReference = f14202c;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        Context contextM406b = C0178f.m403c().m406b();
        e0 e0Var = C2631g.f14219g;
        boolean z6 = C1716e.m5403a(contextM406b, ModuleDescriptor.MODULE_ID) > 0;
        atomicReference.set(Boolean.valueOf(z6));
        return z6;
    }
}

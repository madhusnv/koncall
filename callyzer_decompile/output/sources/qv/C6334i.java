package qv;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import ar.C0420j;
import bs.C0751i;
import com.websoptimization.callyzerbiz.R;
import dr.C1775y;
import ds.C1780d;
import du.C1826h;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import g2.ja;
import g4.C2490f;
import g4.C2492h;
import im.EnumC3313o;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jp.C3833n;
import k2.h2;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;
import or.C5454q;
import org.bouncycastle.iana.AEADAlgorithm;
import q1.C6080h;
import qi.RunnableC6224g;
import qw.C6361k;
import qw.a0;
import rv.C6644t;
import rw.AbstractC6663m;
import s2.C6734c;
import sq.C6908y;
import su.C6952k;
import sv.C6955c;
import uq.C7505k;
import ux.C7569c;
import vr.C7734b;
import vt.C7770a;
import wq.C8142a;
import wr.C8158n;
import wt.C8184b;
import xv.C8492s;
import yp.C8735o;
import yq.C8741f;
import yr.C8744c;
import yr.C8748g;
import yt.C8770b;
import yv.C8800o;
import zr.C9031a;
import zr.C9032b;
import zu.C9084n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qv.i */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6334i implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f30707a;

    /* renamed from: b */
    public final /* synthetic */ Object f30708b;

    /* renamed from: c */
    public final /* synthetic */ Object f30709c;

    public /* synthetic */ C6334i(int i10, InterfaceC2139c interfaceC2139c, Object obj) {
        this.f30707a = i10;
        this.f30709c = obj;
        this.f30708b = interfaceC2139c;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) throws NumberFormatException {
        int i10 = this.f30707a;
        int i11 = 0;
        a0 a0Var = a0.f30746a;
        Object obj2 = this.f30708b;
        Object obj3 = this.f30709c;
        switch (i10) {
            case 0:
                ((InterfaceC2139c) obj2).invoke(new C6644t((C6955c) obj3, ((Boolean) obj).booleanValue()));
                break;
            case 1:
                w0 w0Var = (w0) obj3;
                if (!((ja) obj2).m6181c()) {
                    w0Var.setValue(Boolean.FALSE);
                    break;
                }
                break;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((InterfaceC2141e) obj2).invoke(((C5454q) obj3).f27491a, bool);
                break;
            case 3:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                ((InterfaceC2139c) obj2).invoke(new C6361k(bool2, ((C6361k) obj3).f30756b));
                break;
            case 4:
                w0 w0Var2 = (w0) obj3;
                int iIntValue = ((Integer) obj).intValue();
                if (((C2490f) AbstractC6663m.m12743G(((C2492h) obj2).m6436c(iIntValue, iIntValue, "toggle"))) != null) {
                    w0Var2.setValue(Boolean.valueOf(!((Boolean) w0Var2.getValue()).booleanValue()));
                    break;
                }
                break;
            case 5:
                ((C7569c) obj2).f36443c.removeCallbacks((RunnableC6224g) obj3);
                break;
            case 6:
                C8492s c8492s = (C8492s) obj2;
                l7.a0 a0Var2 = (l7.a0) obj3;
                Map permissionsMap = (Map) obj;
                AbstractC4154l.m8923f(permissionsMap, "permissionsMap");
                if (!permissionsMap.isEmpty()) {
                    Collection collectionValues = permissionsMap.values();
                    if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                        Iterator it = collectionValues.iterator();
                        while (it.hasNext()) {
                            if (!((Boolean) it.next()).booleanValue()) {
                                l7.a0.m9181f(a0Var2, "permission_not_granted");
                                break;
                            }
                        }
                        c8492s.f41383b.m16469e();
                        break;
                    } else {
                        c8492s.f41383b.m16469e();
                    }
                }
                break;
            case 7:
                InterfaceC2139c interfaceC2139c = (InterfaceC2139c) obj2;
                EnumC3313o it2 = (EnumC3313o) obj;
                AbstractC4154l.m8923f(it2, "it");
                if (!((C9032b) obj3).f43532z) {
                    interfaceC2139c.invoke(new C8744c(it2));
                    break;
                }
                break;
            case 8:
                Calendar selectedDateTime = (Calendar) obj;
                AbstractC4154l.m8923f(selectedDateTime, "selectedDateTime");
                ((w0) obj3).setValue(Boolean.FALSE);
                C8800o c8800o = C8800o.f42459a;
                ((C0751i) obj2).m2057q(new C8748g(C8800o.m16182F(selectedDateTime.getTimeInMillis())));
                break;
            case 9:
                C6080h LazyColumn = (C6080h) obj;
                AbstractC4154l.m8923f(LazyColumn, "$this$LazyColumn");
                List list = ((C9031a) obj3).f43487d;
                LazyColumn.m12099p(list.size(), new C8158n(i11, new C7734b(6), list), new C6908y(list, 17), new C6734c(new C1780d(5, (InterfaceC2139c) obj2, list), true, -1091073711));
                break;
            case 10:
                Context context = (Context) obj2;
                C8735o c8735o = (C8735o) obj3;
                Uri uri = (Uri) obj;
                if (uri == null) {
                    Toast.makeText(context, context.getString(R.string.failed_to_create_file), 0).show();
                }
                ContentResolver contentResolver = context.getContentResolver();
                AbstractC4154l.m8922e(contentResolver, "getContentResolver(...)");
                c8735o.m16117m(new C3833n(uri, contentResolver));
                break;
            case 11:
                h2 h2Var = (h2) obj2;
                C6080h LazyColumn2 = (C6080h) obj;
                AbstractC4154l.m8923f(LazyColumn2, "$this$LazyColumn");
                List list2 = ((C8142a) h2Var.getValue()).f38995a;
                LazyColumn2.m12099p(list2.size(), null, new C6908y(list2, 20), new C6734c(new bt.a0(list2, (C8741f) obj3, h2Var, 11), true, -632812321));
                break;
            case 12:
                Context context2 = (Context) obj2;
                C8741f c8741f = (C8741f) obj3;
                Uri uri2 = (Uri) obj;
                if (uri2 == null) {
                    Toast.makeText(context2, context2.getString(R.string.failed_to_create_file), 0).show();
                }
                ContentResolver contentResolver2 = context2.getContentResolver();
                AbstractC4154l.m8922e(contentResolver2, "getContentResolver(...)");
                c8741f.m16121f(new C7505k(uri2, contentResolver2));
                break;
            case 13:
                C8770b c8770b = (C8770b) obj3;
                String qrCode = (String) obj;
                AbstractC4154l.m8923f(qrCode, "qrCode");
                if (!((C8184b) ((h2) obj2).getValue()).f39143a) {
                    c8770b.m16127e(new C7770a(qrCode));
                    break;
                }
                break;
            case 14:
                InterfaceC2139c interfaceC2139c2 = (InterfaceC2139c) obj2;
                int iIntValue2 = ((Integer) obj).intValue();
                if (((C2490f) AbstractC6663m.m12743G(((C2492h) obj3).m6435b(iIntValue2, iIntValue2))) != null) {
                    interfaceC2139c2.invoke(C9084n.f43616a);
                    break;
                }
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                Context context3 = (Context) obj2;
                C1775y c1775y = (C1775y) obj3;
                Uri uri3 = (Uri) obj;
                if (uri3 == null) {
                    Toast.makeText(context3, context3.getString(R.string.failed_to_create_file), 0).show();
                }
                ContentResolver contentResolver3 = context3.getContentResolver();
                AbstractC4154l.m8922e(contentResolver3, "getContentResolver(...)");
                c1775y.m5459s(new C0420j(uri3, contentResolver3));
                break;
            default:
                Map it3 = (Map) obj;
                AbstractC4154l.m8923f(it3, "it");
                ((C6952k) obj3).m13203e(C1826h.f8803a);
                ((InterfaceC2139c) obj2).invoke("no permission granted : " + it3.entrySet());
                break;
        }
        return a0Var;
    }

    public /* synthetic */ C6334i(int i10, Object obj, Object obj2) {
        this.f30707a = i10;
        this.f30708b = obj;
        this.f30709c = obj2;
    }
}

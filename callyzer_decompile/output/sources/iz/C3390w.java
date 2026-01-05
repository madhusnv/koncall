package iz;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import mz.C4920d;
import nx.AbstractC5178p;
import og.pe;
import qz.AbstractC6396n;
import qz.C6385c;
import rw.AbstractC6664n;
import yz.AbstractC8831a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: iz.w */
/* loaded from: classes3.dex */
public final class C3390w {

    /* renamed from: a */
    public final /* synthetic */ int f17982a;

    /* renamed from: b */
    public String f17983b;

    /* renamed from: c */
    public int f17984c;

    /* renamed from: d */
    public Object f17985d;

    /* renamed from: e */
    public Object f17986e;

    /* renamed from: f */
    public Object f17987f;

    /* renamed from: g */
    public Object f17988g;

    /* renamed from: h */
    public Object f17989h;

    /* renamed from: i */
    public Object f17990i;

    public C3390w(C4920d taskRunner) {
        this.f17982a = 1;
        AbstractC4154l.m8923f(taskRunner, "taskRunner");
        this.f17985d = taskRunner;
        this.f17989h = AbstractC6396n.f30837a;
        this.f17990i = C6385c.f30793a;
    }

    /* renamed from: d */
    public static ArrayList m7792d(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            int iM10098I = AbstractC5178p.m10098I(str, '&', i10, 4);
            if (iM10098I == -1) {
                iM10098I = str.length();
            }
            int iM10098I2 = AbstractC5178p.m10098I(str, '=', i10, 4);
            if (iM10098I2 == -1 || iM10098I2 > iM10098I) {
                String strSubstring = str.substring(i10, iM10098I);
                AbstractC4154l.m8922e(strSubstring, "substring(...)");
                arrayList.add(strSubstring);
                arrayList.add(null);
            } else {
                String strSubstring2 = str.substring(i10, iM10098I2);
                AbstractC4154l.m8922e(strSubstring2, "substring(...)");
                arrayList.add(strSubstring2);
                String strSubstring3 = str.substring(iM10098I2 + 1, iM10098I);
                AbstractC4154l.m8922e(strSubstring3, "substring(...)");
                arrayList.add(strSubstring3);
            }
            i10 = iM10098I + 1;
        }
        return arrayList;
    }

    /* renamed from: a */
    public C3391x m7793a() {
        ArrayList arrayList;
        String str = this.f17983b;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String strM16287d = AbstractC8831a.m16287d(0, 0, 7, (String) this.f17985d);
        String strM16287d2 = AbstractC8831a.m16287d(0, 0, 7, (String) this.f17986e);
        String str2 = (String) this.f17987f;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iM7794b = m7794b();
        ArrayList arrayList2 = (ArrayList) this.f17989h;
        ArrayList arrayList3 = new ArrayList(AbstractC6664n.m12768r(arrayList2, 10));
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            arrayList3.add(AbstractC8831a.m16287d(0, 0, 7, (String) obj));
        }
        ArrayList arrayList4 = (ArrayList) this.f17990i;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList(AbstractC6664n.m12768r(arrayList4, 10));
            int size2 = arrayList4.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList4.get(i11);
                i11++;
                String str3 = (String) obj2;
                arrayList5.add(str3 != null ? AbstractC8831a.m16287d(0, 0, 3, str3) : null);
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        String str4 = (String) this.f17988g;
        return new C3391x(str, strM16287d, strM16287d2, str2, iM7794b, arrayList3, arrayList, str4 != null ? AbstractC8831a.m16287d(0, 0, 7, str4) : null, toString());
    }

    /* renamed from: b */
    public int m7794b() {
        int i10 = this.f17984c;
        if (i10 != -1) {
            return i10;
        }
        String str = this.f17983b;
        AbstractC4154l.m8920c(str);
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x002e  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m7795c(iz.C3391x r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: iz.C3390w.m7795c(iz.x, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: iz.C3390w.toString():java.lang.String");
    }

    public C3390w() {
        this.f17982a = 0;
        this.f17985d = "";
        this.f17986e = "";
        this.f17984c = -1;
        this.f17989h = pe.m10835j("");
    }
}

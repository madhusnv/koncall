package b00;

import c00.AbstractC0835b;
import c00.C0840g;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import og.oe;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b00.b */
/* loaded from: classes3.dex */
public abstract class AbstractC0517b {

    /* renamed from: a */
    public static final C0523h f3587a = new C0523h();

    /* renamed from: a */
    public static final boolean m1522a(int i10, byte[] a10, int i11, byte[] b10, int i12) {
        AbstractC4154l.m8923f(a10, "a");
        AbstractC4154l.m8923f(b10, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (a10[i13 + i10] != b10[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final c0 m1523b(h0 h0Var) {
        AbstractC4154l.m8923f(h0Var, "<this>");
        return new c0(h0Var);
    }

    /* renamed from: c */
    public static final d0 m1524c(i0 i0Var) {
        AbstractC4154l.m8923f(i0Var, "<this>");
        return new d0(i0Var);
    }

    /* renamed from: d */
    public static void m1525d(long j6, C0526k c0526k, int i10, ArrayList arrayList, int i11, int i12, ArrayList arrayList2) {
        int i13;
        int i14;
        ArrayList arrayList3;
        long j10;
        int i15;
        int i16 = i10;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i11 >= i12) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i17 = i11; i17 < i12; i17++) {
            if (((C0529n) arrayList4.get(i17)).mo1563d() < i16) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        C0529n c0529n = (C0529n) arrayList.get(i11);
        C0529n c0529n2 = (C0529n) arrayList4.get(i12 - 1);
        if (i16 == c0529n.mo1563d()) {
            int iIntValue = ((Number) arrayList5.get(i11)).intValue();
            int i18 = i11 + 1;
            C0529n c0529n3 = (C0529n) arrayList4.get(i18);
            i13 = i18;
            i14 = iIntValue;
            c0529n = c0529n3;
        } else {
            i13 = i11;
            i14 = -1;
        }
        if (c0529n.mo1567i(i16) == c0529n2.mo1567i(i16)) {
            int iMin = Math.min(c0529n.mo1563d(), c0529n2.mo1563d());
            int i19 = 0;
            for (int i20 = i16; i20 < iMin && c0529n.mo1567i(i20) == c0529n2.mo1567i(i20); i20++) {
                i19++;
            }
            long j11 = 4;
            long j12 = (c0526k.f3638b / j11) + j6 + 2 + i19 + 1;
            c0526k.E0(-i19);
            c0526k.E0(i14);
            int i21 = i16 + i19;
            while (i16 < i21) {
                c0526k.E0(c0529n.mo1567i(i16) & 255);
                i16++;
            }
            if (i13 + 1 == i12) {
                if (i21 != ((C0529n) arrayList4.get(i13)).mo1563d()) {
                    throw new IllegalStateException("Check failed.");
                }
                c0526k.E0(((Number) arrayList5.get(i13)).intValue());
                return;
            } else {
                C0526k c0526k2 = new C0526k();
                c0526k.E0(((int) ((c0526k2.f3638b / j11) + j12)) * (-1));
                m1525d(j12, c0526k2, i21, arrayList4, i13, i12, arrayList5);
                c0526k.j0(c0526k2);
                return;
            }
        }
        int i22 = 1;
        for (int i23 = i13 + 1; i23 < i12; i23++) {
            if (((C0529n) arrayList4.get(i23 - 1)).mo1567i(i16) != ((C0529n) arrayList4.get(i23)).mo1567i(i16)) {
                i22++;
            }
        }
        long j13 = 4;
        long j14 = (c0526k.f3638b / j13) + j6 + 2 + (i22 * 2);
        c0526k.E0(i22);
        c0526k.E0(i14);
        for (int i24 = i13; i24 < i12; i24++) {
            int iMo1567i = ((C0529n) arrayList4.get(i24)).mo1567i(i16);
            if (i24 == i13 || iMo1567i != ((C0529n) arrayList4.get(i24 - 1)).mo1567i(i16)) {
                c0526k.E0(iMo1567i & 255);
            }
        }
        C0526k c0526k3 = new C0526k();
        int i25 = i13;
        while (i25 < i12) {
            byte bMo1567i = ((C0529n) arrayList4.get(i25)).mo1567i(i16);
            int i26 = i25 + 1;
            int i27 = i26;
            while (true) {
                if (i27 >= i12) {
                    i27 = i12;
                    break;
                } else if (bMo1567i != ((C0529n) arrayList4.get(i27)).mo1567i(i16)) {
                    break;
                } else {
                    i27++;
                }
            }
            if (i26 == i27 && i16 + 1 == ((C0529n) arrayList4.get(i25)).mo1563d()) {
                c0526k.E0(((Number) arrayList5.get(i25)).intValue());
                arrayList3 = arrayList5;
                j10 = j14;
                i15 = i27;
            } else {
                c0526k.E0(((int) ((c0526k3.f3638b / j13) + j14)) * (-1));
                arrayList3 = arrayList5;
                j10 = j14;
                i15 = i27;
                m1525d(j10, c0526k3, i16 + 1, arrayList, i25, i15, arrayList3);
                arrayList4 = arrayList;
            }
            j14 = j10;
            i25 = i15;
            arrayList5 = arrayList3;
        }
        c0526k.j0(c0526k3);
    }

    /* renamed from: e */
    public static final void m1526e(long j6, long j10, long j11) {
        if ((j10 | j11) < 0 || j10 > j6 || j6 - j10 < j11) {
            throw new ArrayIndexOutOfBoundsException("size=" + j6 + " offset=" + j10 + " byteCount=" + j11);
        }
    }

    /* renamed from: f */
    public static final C0519d m1527f(File file, boolean z6) {
        AbstractC4154l.m8923f(file, "<this>");
        return new C0519d(1, new FileOutputStream(file, z6), new k0());
    }

    /* renamed from: g */
    public static final C0519d m1528g(Socket socket) throws IOException {
        C0840g c0840g = new C0840g(socket);
        OutputStream outputStream = socket.getOutputStream();
        AbstractC4154l.m8922e(outputStream, "getOutputStream(...)");
        return new C0519d(0, c0840g, new C0519d(1, outputStream, c0840g));
    }

    /* renamed from: h */
    public static final C0520e m1529h(InputStream inputStream) {
        AbstractC4154l.m8923f(inputStream, "<this>");
        return new C0520e(inputStream, new k0());
    }

    /* renamed from: i */
    public static final C0520e m1530i(Socket socket) throws IOException {
        AbstractC4154l.m8923f(socket, "<this>");
        C0840g c0840g = new C0840g(socket);
        InputStream inputStream = socket.getInputStream();
        AbstractC4154l.m8922e(inputStream, "getInputStream(...)");
        return new C0520e(c0840g, new C0520e(inputStream, c0840g));
    }

    /* renamed from: j */
    public static final String m1531j(int i10) {
        if (i10 == 0) {
            return "0";
        }
        char[] cArr = AbstractC0835b.f5298a;
        int i11 = 0;
        char[] cArr2 = {cArr[(i10 >> 28) & 15], cArr[(i10 >> 24) & 15], cArr[(i10 >> 20) & 15], cArr[(i10 >> 16) & 15], cArr[(i10 >> 12) & 15], cArr[(i10 >> 8) & 15], cArr[(i10 >> 4) & 15], cArr[i10 & 15]};
        while (i11 < 8 && cArr2[i11] == '0') {
            i11++;
        }
        oe.m10799a(i11, 8, 8);
        return new String(cArr2, i11, 8 - i11);
    }
}

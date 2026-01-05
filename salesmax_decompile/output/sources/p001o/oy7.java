package p001o;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import org.objectweb.asm.Opcodes;

/* loaded from: classes6.dex */
public final class oy7 {

    /* renamed from: b */
    public static final String[] f39044b = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* renamed from: c */
    public static final int[][] f39045c = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* renamed from: d */
    public static final int[][] f39046d;

    /* renamed from: e */
    public static final int[][] f39047e;

    /* renamed from: a */
    public final byte[] f39048a;

    /* renamed from: o.oy7$a */
    public class C15911a implements Comparator {
        public C15911a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(o4g o4gVar, o4g o4gVar2) {
            return o4gVar.m41531d() - o4gVar2.m41531d();
        }
    }

    static {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 5, 256);
        f39046d = iArr;
        iArr[0][32] = 1;
        for (int i = 65; i <= 90; i++) {
            f39046d[0][i] = (i - 65) + 2;
        }
        f39046d[1][32] = 1;
        for (int i2 = 97; i2 <= 122; i2++) {
            f39046d[1][i2] = (i2 - 97) + 2;
        }
        f39046d[2][32] = 1;
        for (int i3 = 48; i3 <= 57; i3++) {
            f39046d[2][i3] = (i3 - 48) + 2;
        }
        int[] iArr2 = f39046d[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, Opcodes.LAND};
        for (int i4 = 0; i4 < 28; i4++) {
            f39046d[3][iArr3[i4]] = i4;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, Opcodes.LSHR, Opcodes.LUSHR};
        for (int i5 = 0; i5 < 31; i5++) {
            int i6 = iArr4[i5];
            if (i6 > 0) {
                f39046d[4][i6] = i5;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 6, 6);
        f39047e = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = f39047e;
        iArr7[0][4] = 0;
        int[] iArr8 = iArr7[1];
        iArr8[4] = 0;
        iArr8[0] = 28;
        iArr7[3][4] = 0;
        int[] iArr9 = iArr7[2];
        iArr9[4] = 0;
        iArr9[0] = 15;
    }

    public oy7(byte[] bArr) {
        this.f39048a = bArr;
    }

    /* renamed from: b */
    public static Collection m42762b(Iterable iterable) {
        boolean z;
        LinkedList linkedList = new LinkedList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            o4g o4gVar = (o4g) it.next();
            Iterator it2 = linkedList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = true;
                    break;
                }
                o4g o4gVar2 = (o4g) it2.next();
                if (o4gVar2.m41533f(o4gVar)) {
                    z = false;
                    break;
                }
                if (o4gVar.m41533f(o4gVar2)) {
                    it2.remove();
                }
            }
            if (z) {
                linkedList.add(o4gVar);
            }
        }
        return linkedList;
    }

    /* renamed from: d */
    public static void m42763d(o4g o4gVar, int i, int i2, Collection collection) {
        o4g o4gVarM41529b = o4gVar.m41529b(i);
        collection.add(o4gVarM41529b.m41534g(4, i2));
        if (o4gVar.m41532e() != 4) {
            collection.add(o4gVarM41529b.m41535h(4, i2));
        }
        if (i2 == 3 || i2 == 4) {
            collection.add(o4gVarM41529b.m41534g(2, 16 - i2).m41534g(2, 1));
        }
        if (o4gVar.m41530c() > 0) {
            collection.add(o4gVar.m41528a(i).m41528a(i + 1));
        }
    }

    /* renamed from: f */
    public static Collection m42764f(Iterable iterable, int i, int i2) {
        LinkedList linkedList = new LinkedList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            m42763d((o4g) it.next(), i, i2, linkedList);
        }
        return m42762b(linkedList);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xh1 m42765a() {
        int i;
        Collection collectionSingletonList = Collections.singletonList(o4g.f37764e);
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f39048a;
            if (i2 >= bArr.length) {
                return ((o4g) Collections.min(collectionSingletonList, new C15911a())).m41536i(this.f39048a);
            }
            int i3 = i2 + 1;
            byte b = i3 < bArr.length ? bArr[i3] : (byte) 0;
            byte b2 = bArr[i2];
            if (b2 != 13) {
                if (b2 != 44) {
                    if (b2 != 46) {
                        i = (b2 == 58 && b == 32) ? 5 : 0;
                    } else if (b == 32) {
                        i = 3;
                    }
                } else if (b == 32) {
                    i = 4;
                }
            } else if (b == 10) {
                i = 2;
            }
            if (i > 0) {
                collectionSingletonList = m42764f(collectionSingletonList, i2, i);
                i2 = i3;
            } else {
                collectionSingletonList = m42767e(collectionSingletonList, i2);
            }
            i2++;
        }
    }

    /* renamed from: c */
    public final void m42766c(o4g o4gVar, int i, Collection collection) {
        char c = (char) (this.f39048a[i] & 255);
        boolean z = f39046d[o4gVar.m41532e()][c] > 0;
        o4g o4gVarM41529b = null;
        for (int i2 = 0; i2 <= 4; i2++) {
            int i3 = f39046d[i2][c];
            if (i3 > 0) {
                if (o4gVarM41529b == null) {
                    o4gVarM41529b = o4gVar.m41529b(i);
                }
                if (!z || i2 == o4gVar.m41532e() || i2 == 2) {
                    collection.add(o4gVarM41529b.m41534g(i2, i3));
                }
                if (!z && f39047e[o4gVar.m41532e()][i2] >= 0) {
                    collection.add(o4gVarM41529b.m41535h(i2, i3));
                }
            }
        }
        if (o4gVar.m41530c() > 0 || f39046d[o4gVar.m41532e()][c] == 0) {
            collection.add(o4gVar.m41528a(i));
        }
    }

    /* renamed from: e */
    public final Collection m42767e(Iterable iterable, int i) {
        LinkedList linkedList = new LinkedList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            m42766c((o4g) it.next(), i, linkedList);
        }
        return m42762b(linkedList);
    }
}

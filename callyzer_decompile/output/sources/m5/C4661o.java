package m5;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import i0.m0;
import i5.AbstractC3171a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.agreement.jpake.JPAKEParticipant;
import org.bouncycastle.iana.AEADAlgorithm;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m5.o */
/* loaded from: classes.dex */
public final class C4661o {

    /* renamed from: d */
    public static final int[] f23049d = {0, 4, 8};

    /* renamed from: e */
    public static final SparseIntArray f23050e;

    /* renamed from: a */
    public final HashMap f23051a = new HashMap();

    /* renamed from: b */
    public final boolean f23052b = true;

    /* renamed from: c */
    public final HashMap f23053c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23050e = sparseIntArray;
        sparseIntArray.append(76, 25);
        sparseIntArray.append(77, 26);
        sparseIntArray.append(79, 29);
        sparseIntArray.append(80, 30);
        sparseIntArray.append(86, 36);
        sparseIntArray.append(85, 35);
        sparseIntArray.append(58, 4);
        sparseIntArray.append(57, 3);
        sparseIntArray.append(55, 1);
        sparseIntArray.append(94, 6);
        sparseIntArray.append(95, 7);
        sparseIntArray.append(65, 17);
        sparseIntArray.append(66, 18);
        sparseIntArray.append(67, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(81, 32);
        sparseIntArray.append(82, 33);
        sparseIntArray.append(64, 10);
        sparseIntArray.append(63, 9);
        sparseIntArray.append(98, 13);
        sparseIntArray.append(101, 16);
        sparseIntArray.append(99, 14);
        sparseIntArray.append(96, 11);
        sparseIntArray.append(100, 15);
        sparseIntArray.append(97, 12);
        sparseIntArray.append(89, 40);
        sparseIntArray.append(74, 39);
        sparseIntArray.append(73, 41);
        sparseIntArray.append(88, 42);
        sparseIntArray.append(72, 20);
        sparseIntArray.append(87, 37);
        sparseIntArray.append(62, 5);
        sparseIntArray.append(75, 82);
        sparseIntArray.append(84, 82);
        sparseIntArray.append(78, 82);
        sparseIntArray.append(56, 82);
        sparseIntArray.append(54, 82);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(90, 54);
        sparseIntArray.append(68, 55);
        sparseIntArray.append(91, 56);
        sparseIntArray.append(69, 57);
        sparseIntArray.append(92, 58);
        sparseIntArray.append(70, 59);
        sparseIntArray.append(59, 61);
        sparseIntArray.append(61, 62);
        sparseIntArray.append(60, 63);
        sparseIntArray.append(27, 64);
        sparseIntArray.append(106, 65);
        sparseIntArray.append(33, 66);
        sparseIntArray.append(107, 67);
        sparseIntArray.append(103, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(102, 68);
        sparseIntArray.append(93, 69);
        sparseIntArray.append(71, 70);
        sparseIntArray.append(31, 71);
        sparseIntArray.append(29, 72);
        sparseIntArray.append(30, 73);
        sparseIntArray.append(32, 74);
        sparseIntArray.append(28, 75);
        sparseIntArray.append(104, 76);
        sparseIntArray.append(83, 77);
        sparseIntArray.append(108, 78);
        sparseIntArray.append(53, 80);
        sparseIntArray.append(52, 81);
    }

    /* renamed from: c */
    public static int[] m9540c(Barrier barrier, String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < strArrSplit.length) {
            String strTrim = strArrSplit[i10].trim();
            Object obj = null;
            try {
                iIntValue = AbstractC4663q.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.f2162n;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.f2162n.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i11] = iIntValue;
            i10++;
            i11++;
        }
        return i11 != strArrSplit.length ? Arrays.copyOf(iArr, i11) : iArr;
    }

    /* renamed from: d */
    public static C4656j m9541d(Context context, AttributeSet attributeSet) {
        C4656j c4656j = new C4656j();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4664r.f23054a);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            C4658l c4658l = c4656j.f22971c;
            C4660n c4660n = c4656j.f22973e;
            C4657k c4657k = c4656j.f22972d;
            if (index != 1 && 23 != index && 24 != index) {
                c4658l.getClass();
                c4657k.getClass();
                c4660n.getClass();
            }
            SparseIntArray sparseIntArray = f23050e;
            int i11 = sparseIntArray.get(index);
            C4659m c4659m = c4656j.f22970b;
            switch (i11) {
                case 1:
                    c4657k.f23015o = m9542f(typedArrayObtainStyledAttributes, index, c4657k.f23015o);
                    break;
                case 2:
                    c4657k.f22980F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4657k.f22980F);
                    break;
                case 3:
                    c4657k.f23014n = m9542f(typedArrayObtainStyledAttributes, index, c4657k.f23014n);
                    break;
                case 4:
                    c4657k.f23013m = m9542f(typedArrayObtainStyledAttributes, index, c4657k.f23013m);
                    break;
                case 5:
                    c4657k.f23022v = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 6:
                    c4657k.f23026z = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c4657k.f23026z);
                    break;
                case 7:
                    c4657k.f22975A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c4657k.f22975A);
                    break;
                case 8:
                    c4657k.f22981G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4657k.f22981G);
                    break;
                case 9:
                    c4657k.f23019s = m9542f(typedArrayObtainStyledAttributes, index, c4657k.f23019s);
                    break;
                case 10:
                    c4657k.f23018r = m9542f(typedArrayObtainStyledAttributes, index, c4657k.f23018r);
                    break;
                case 11:
                    c4657k.f22986L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4657k.f22986L);
                    break;
                case 12:
                    c4657k.f22987M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4657k.f22987M);
                    break;
                case 13:
                    c4657k.f22983I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4657k.f22983I);
                    break;
                case 14:
                    c4657k.f22985K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4657k.f22985K);
                    break;
                case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                    c4657k.f22988N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4657k.f22988N);
                    break;
                case 16:
                    c4657k.f22984J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4657k.f22984J);
                    break;
                case 17:
                    c4657k.f23004d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c4657k.f23004d);
                    break;
                case 18:
                    c4657k.f23005e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c4657k.f23005e);
                    break;
                case 19:
                    c4657k.f23006f = typedArrayObtainStyledAttributes.getFloat(index, c4657k.f23006f);
                    break;
                case 20:
                    c4657k.f23020t = typedArrayObtainStyledAttributes.getFloat(index, c4657k.f23020t);
                    break;
                case 21:
                    c4657k.f23003c = typedArrayObtainStyledAttributes.getLayoutDimension(index, c4657k.f23003c);
                    break;
                case 22:
                    int i12 = typedArrayObtainStyledAttributes.getInt(index, c4659m.f23032a);
                    c4659m.f23032a = i12;
                    c4659m.f23032a = f23049d[i12];
                    break;
                case 23:
                    c4657k.f23002b = typedArrayObtainStyledAttributes.getLayoutDimension(index, c4657k.f23002b);
                    break;
                case 24:
                    c4657k.f22977C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4657k.f22977C);
                    break;
                case 25:
                    c4657k.f23007g = m9542f(typedArrayObtainStyledAttributes, index, c4657k.f23007g);
                    break;
                case 26:
                    c4657k.f23008h = m9542f(typedArrayObtainStyledAttributes, index, c4657k.f23008h);
                    break;
                case 27:
                    c4657k.f22976B = typedArrayObtainStyledAttributes.getInt(index, c4657k.f22976B);
                    break;
                case 28:
                    c4657k.f22978D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4657k.f22978D);
                    break;
                case 29:
                    c4657k.f23009i = m9542f(typedArrayObtainStyledAttributes, index, c4657k.f23009i);
                    break;
                case 30:
                    c4657k.f23010j = m9542f(typedArrayObtainStyledAttributes, index, c4657k.f23010j);
                    break;
                case BERTags.DATE /* 31 */:
                    c4657k.f22982H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4657k.f22982H);
                    break;
                case 32:
                    c4657k.f23016p = m9542f(typedArrayObtainStyledAttributes, index, c4657k.f23016p);
                    break;
                case BERTags.DATE_TIME /* 33 */:
                    c4657k.f23017q = m9542f(typedArrayObtainStyledAttributes, index, c4657k.f23017q);
                    break;
                case BERTags.DURATION /* 34 */:
                    c4657k.f22979E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4657k.f22979E);
                    break;
                case BERTags.OBJECT_IDENTIFIER_IRI /* 35 */:
                    c4657k.f23012l = m9542f(typedArrayObtainStyledAttributes, index, c4657k.f23012l);
                    break;
                case BERTags.RELATIVE_OID_IRI /* 36 */:
                    c4657k.f23011k = m9542f(typedArrayObtainStyledAttributes, index, c4657k.f23011k);
                    break;
                case 37:
                    c4657k.f23021u = typedArrayObtainStyledAttributes.getFloat(index, c4657k.f23021u);
                    break;
                case 38:
                    c4656j.f22969a = typedArrayObtainStyledAttributes.getResourceId(index, c4656j.f22969a);
                    break;
                case 39:
                    c4657k.f22990P = typedArrayObtainStyledAttributes.getFloat(index, c4657k.f22990P);
                    break;
                case JPAKEParticipant.STATE_ROUND_2_VALIDATED /* 40 */:
                    c4657k.f22989O = typedArrayObtainStyledAttributes.getFloat(index, c4657k.f22989O);
                    break;
                case 41:
                    c4657k.f22991Q = typedArrayObtainStyledAttributes.getInt(index, c4657k.f22991Q);
                    break;
                case 42:
                    c4657k.f22992R = typedArrayObtainStyledAttributes.getInt(index, c4657k.f22992R);
                    break;
                case 43:
                    c4659m.f23034c = typedArrayObtainStyledAttributes.getFloat(index, c4659m.f23034c);
                    break;
                case 44:
                    c4660n.f23047k = true;
                    c4660n.f23048l = typedArrayObtainStyledAttributes.getDimension(index, c4660n.f23048l);
                    break;
                case 45:
                    c4660n.f23038b = typedArrayObtainStyledAttributes.getFloat(index, c4660n.f23038b);
                    break;
                case 46:
                    c4660n.f23039c = typedArrayObtainStyledAttributes.getFloat(index, c4660n.f23039c);
                    break;
                case 47:
                    c4660n.f23040d = typedArrayObtainStyledAttributes.getFloat(index, c4660n.f23040d);
                    break;
                case 48:
                    c4660n.f23041e = typedArrayObtainStyledAttributes.getFloat(index, c4660n.f23041e);
                    break;
                case 49:
                    c4660n.f23042f = typedArrayObtainStyledAttributes.getDimension(index, c4660n.f23042f);
                    break;
                case 50:
                    c4660n.f23043g = typedArrayObtainStyledAttributes.getDimension(index, c4660n.f23043g);
                    break;
                case 51:
                    c4660n.f23044h = typedArrayObtainStyledAttributes.getDimension(index, c4660n.f23044h);
                    break;
                case 52:
                    c4660n.f23045i = typedArrayObtainStyledAttributes.getDimension(index, c4660n.f23045i);
                    break;
                case 53:
                    c4660n.f23046j = typedArrayObtainStyledAttributes.getDimension(index, c4660n.f23046j);
                    break;
                case 54:
                    c4657k.f22993S = typedArrayObtainStyledAttributes.getInt(index, c4657k.f22993S);
                    break;
                case 55:
                    c4657k.f22994T = typedArrayObtainStyledAttributes.getInt(index, c4657k.f22994T);
                    break;
                case 56:
                    c4657k.f22995U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4657k.f22995U);
                    break;
                case 57:
                    c4657k.f22996V = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4657k.f22996V);
                    break;
                case 58:
                    c4657k.f22997W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4657k.f22997W);
                    break;
                case 59:
                    c4657k.f22998X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4657k.f22998X);
                    break;
                case JPAKEParticipant.STATE_ROUND_3_CREATED /* 60 */:
                    c4660n.f23037a = typedArrayObtainStyledAttributes.getFloat(index, c4660n.f23037a);
                    break;
                case 61:
                    c4657k.f23023w = m9542f(typedArrayObtainStyledAttributes, index, c4657k.f23023w);
                    break;
                case 62:
                    c4657k.f23024x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4657k.f23024x);
                    break;
                case 63:
                    c4657k.f23025y = typedArrayObtainStyledAttributes.getFloat(index, c4657k.f23025y);
                    break;
                case 64:
                    c4658l.f23028a = m9542f(typedArrayObtainStyledAttributes, index, c4658l.f23028a);
                    break;
                case 65:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        c4658l.getClass();
                        break;
                    } else {
                        String str = AbstractC3171a.f17098a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        c4658l.getClass();
                        break;
                    }
                case 66:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    c4658l.getClass();
                    break;
                case 67:
                    c4658l.f23031d = typedArrayObtainStyledAttributes.getFloat(index, c4658l.f23031d);
                    break;
                case 68:
                    c4659m.f23035d = typedArrayObtainStyledAttributes.getFloat(index, c4659m.f23035d);
                    break;
                case 69:
                    c4657k.f22999Y = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case JPAKEParticipant.STATE_ROUND_3_VALIDATED /* 70 */:
                    c4657k.f23000Z = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 71:
                    break;
                case 72:
                    c4657k.f44421a0 = typedArrayObtainStyledAttributes.getInt(index, c4657k.f44421a0);
                    break;
                case 73:
                    c4657k.f44422b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4657k.f44422b0);
                    break;
                case 74:
                    c4657k.f44425e0 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 75:
                    c4657k.f44429i0 = typedArrayObtainStyledAttributes.getBoolean(index, c4657k.f44429i0);
                    break;
                case 76:
                    c4658l.f23029b = typedArrayObtainStyledAttributes.getInt(index, c4658l.f23029b);
                    break;
                case 77:
                    c4657k.f44426f0 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 78:
                    c4659m.f23033b = typedArrayObtainStyledAttributes.getInt(index, c4659m.f23033b);
                    break;
                case 79:
                    c4658l.f23030c = typedArrayObtainStyledAttributes.getFloat(index, c4658l.f23030c);
                    break;
                case 80:
                    c4657k.f44427g0 = typedArrayObtainStyledAttributes.getBoolean(index, c4657k.f44427g0);
                    break;
                case 81:
                    c4657k.f44428h0 = typedArrayObtainStyledAttributes.getBoolean(index, c4657k.f44428h0);
                    break;
                case 82:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    break;
                default:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return c4656j;
    }

    /* renamed from: f */
    public static int m9542f(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    /* renamed from: a */
    public final void m9543a(ConstraintLayout constraintLayout) {
        C4661o c4661o = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map = c4661o.f23053c;
        HashSet hashSet = new HashSet(map.keySet());
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id2))) {
                try {
                    childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                }
            } else {
                if (c4661o.f23052b && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1 && map.containsKey(Integer.valueOf(id2))) {
                    hashSet.remove(Integer.valueOf(id2));
                    C4656j c4656j = (C4656j) map.get(Integer.valueOf(id2));
                    if (childAt instanceof Barrier) {
                        c4656j.f22972d.f44423c0 = 1;
                    }
                    C4657k c4657k = c4656j.f22972d;
                    C4659m c4659m = c4656j.f22970b;
                    C4660n c4660n = c4656j.f22973e;
                    int i11 = c4657k.f44423c0;
                    if (i11 != -1 && i11 == 1) {
                        Barrier barrier = (Barrier) childAt;
                        barrier.setId(id2);
                        barrier.setType(c4657k.f44421a0);
                        barrier.setMargin(c4657k.f44422b0);
                        barrier.setAllowsGoneWidget(c4657k.f44429i0);
                        int[] iArr = c4657k.f44424d0;
                        if (iArr != null) {
                            barrier.setReferencedIds(iArr);
                        } else {
                            String str = c4657k.f44425e0;
                            if (str != null) {
                                int[] iArrM9540c = m9540c(barrier, str);
                                c4657k.f44424d0 = iArrM9540c;
                                barrier.setReferencedIds(iArrM9540c);
                            }
                        }
                    }
                    C4653g c4653g = (C4653g) childAt.getLayoutParams();
                    c4653g.m9533a();
                    c4656j.m9535a(c4653g);
                    HashMap map2 = c4656j.f22974f;
                    Class<?> cls = childAt.getClass();
                    for (String str2 : map2.keySet()) {
                        C4649c c4649c = (C4649c) map2.get(str2);
                        String strM7378k = m0.m7378k("set", str2);
                        try {
                            int i12 = AbstractC4647a.f22890a[c4649c.f22891a.ordinal()];
                            Class cls2 = Integer.TYPE;
                            Class cls3 = Float.TYPE;
                            switch (i12) {
                                case 1:
                                    cls.getMethod(strM7378k, cls2).invoke(childAt, Integer.valueOf(c4649c.f22896f));
                                    break;
                                case 2:
                                    Method method = cls.getMethod(strM7378k, Drawable.class);
                                    ColorDrawable colorDrawable = new ColorDrawable();
                                    colorDrawable.setColor(c4649c.f22896f);
                                    method.invoke(childAt, colorDrawable);
                                    break;
                                case 3:
                                    cls.getMethod(strM7378k, cls2).invoke(childAt, Integer.valueOf(c4649c.f22892b));
                                    break;
                                case 4:
                                    cls.getMethod(strM7378k, cls3).invoke(childAt, Float.valueOf(c4649c.f22893c));
                                    break;
                                case 5:
                                    cls.getMethod(strM7378k, CharSequence.class).invoke(childAt, c4649c.f22894d);
                                    break;
                                case 6:
                                    cls.getMethod(strM7378k, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c4649c.f22895e));
                                    break;
                                case 7:
                                    cls.getMethod(strM7378k, cls3).invoke(childAt, Float.valueOf(c4649c.f22893c));
                                    break;
                            }
                        } catch (IllegalAccessException e2) {
                            e2.printStackTrace();
                        } catch (NoSuchMethodException e10) {
                            e10.getMessage();
                        } catch (InvocationTargetException e11) {
                            e11.printStackTrace();
                        }
                    }
                    childAt.setLayoutParams(c4653g);
                    if (c4659m.f23033b == 0) {
                        childAt.setVisibility(c4659m.f23032a);
                    }
                    childAt.setAlpha(c4659m.f23034c);
                    childAt.setRotation(c4660n.f23037a);
                    childAt.setRotationX(c4660n.f23038b);
                    childAt.setRotationY(c4660n.f23039c);
                    childAt.setScaleX(c4660n.f23040d);
                    childAt.setScaleY(c4660n.f23041e);
                    if (!Float.isNaN(c4660n.f23042f)) {
                        childAt.setPivotX(c4660n.f23042f);
                    }
                    if (!Float.isNaN(c4660n.f23043g)) {
                        childAt.setPivotY(c4660n.f23043g);
                    }
                    childAt.setTranslationX(c4660n.f23044h);
                    childAt.setTranslationY(c4660n.f23045i);
                    childAt.setTranslationZ(c4660n.f23046j);
                    if (c4660n.f23047k) {
                        childAt.setElevation(c4660n.f23048l);
                    }
                }
            }
            i10++;
            c4661o = this;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C4656j c4656j2 = (C4656j) map.get(num);
            C4657k c4657k2 = c4656j2.f22972d;
            int i13 = c4657k2.f44423c0;
            if (i13 != -1 && i13 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                int[] iArr2 = c4657k2.f44424d0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str3 = c4657k2.f44425e0;
                    if (str3 != null) {
                        int[] iArrM9540c2 = m9540c(barrier2, str3);
                        c4657k2.f44424d0 = iArrM9540c2;
                        barrier2.setReferencedIds(iArrM9540c2);
                    }
                }
                barrier2.setType(c4657k2.f44421a0);
                barrier2.setMargin(c4657k2.f44422b0);
                C4653g c4653gM732a = ConstraintLayout.m732a();
                barrier2.m9532d();
                c4656j2.m9535a(c4653gM732a);
                constraintLayout.addView(barrier2, c4653gM732a);
            }
            if (c4657k2.f23001a) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                C4653g c4653gM732a2 = ConstraintLayout.m732a();
                c4656j2.m9535a(c4653gM732a2);
                constraintLayout.addView(guideline, c4653gM732a2);
            }
        }
    }

    /* renamed from: b */
    public final void m9544b(ConstraintLayout constraintLayout) {
        C4661o c4661o = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map = c4661o.f23053c;
        map.clear();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = constraintLayout.getChildAt(i10);
            C4653g c4653g = (C4653g) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (c4661o.f23052b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id2))) {
                map.put(Integer.valueOf(id2), new C4656j());
            }
            C4656j c4656j = (C4656j) map.get(Integer.valueOf(id2));
            HashMap map2 = new HashMap();
            Class<?> cls = childAt.getClass();
            HashMap map3 = c4661o.f23051a;
            for (String str : map3.keySet()) {
                C4649c c4649c = (C4649c) map3.get(str);
                try {
                    if (str.equals("BackgroundColor")) {
                        map2.put(str, new C4649c(c4649c, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                    } else {
                        map2.put(str, new C4649c(c4649c, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                    }
                } catch (IllegalAccessException e2) {
                    e2.printStackTrace();
                } catch (NoSuchMethodException e10) {
                    e10.printStackTrace();
                } catch (InvocationTargetException e11) {
                    e11.printStackTrace();
                }
            }
            c4656j.f22974f = map2;
            C4659m c4659m = c4656j.f22970b;
            C4657k c4657k = c4656j.f22972d;
            C4660n c4660n = c4656j.f22973e;
            c4656j.f22969a = id2;
            c4657k.f23007g = c4653g.f22934d;
            c4657k.f23008h = c4653g.f22935e;
            c4657k.f23009i = c4653g.f22936f;
            c4657k.f23010j = c4653g.f22937g;
            c4657k.f23011k = c4653g.f22938h;
            c4657k.f23012l = c4653g.f22939i;
            c4657k.f23013m = c4653g.f22940j;
            c4657k.f23014n = c4653g.f22941k;
            c4657k.f23015o = c4653g.f22942l;
            c4657k.f23016p = c4653g.f22946p;
            c4657k.f23017q = c4653g.f22947q;
            c4657k.f23018r = c4653g.f22948r;
            c4657k.f23019s = c4653g.f22949s;
            c4657k.f23020t = c4653g.f22956z;
            c4657k.f23021u = c4653g.f22905A;
            c4657k.f23022v = c4653g.f22906B;
            c4657k.f23023w = c4653g.f22943m;
            c4657k.f23024x = c4653g.f22944n;
            c4657k.f23025y = c4653g.f22945o;
            c4657k.f23026z = c4653g.f22920P;
            c4657k.f22975A = c4653g.f22921Q;
            c4657k.f22976B = c4653g.f22922R;
            c4657k.f23006f = c4653g.f22933c;
            c4657k.f23004d = c4653g.f22931a;
            c4657k.f23005e = c4653g.f22932b;
            c4657k.f23002b = ((ViewGroup.MarginLayoutParams) c4653g).width;
            c4657k.f23003c = ((ViewGroup.MarginLayoutParams) c4653g).height;
            c4657k.f22977C = ((ViewGroup.MarginLayoutParams) c4653g).leftMargin;
            c4657k.f22978D = ((ViewGroup.MarginLayoutParams) c4653g).rightMargin;
            c4657k.f22979E = ((ViewGroup.MarginLayoutParams) c4653g).topMargin;
            c4657k.f22980F = ((ViewGroup.MarginLayoutParams) c4653g).bottomMargin;
            c4657k.f22989O = c4653g.f22909E;
            c4657k.f22990P = c4653g.f22908D;
            c4657k.f22992R = c4653g.f22911G;
            c4657k.f22991Q = c4653g.f22910F;
            c4657k.f44427g0 = c4653g.f22923S;
            c4657k.f44428h0 = c4653g.f22924T;
            c4657k.f22993S = c4653g.f22912H;
            c4657k.f22994T = c4653g.f22913I;
            c4657k.f22995U = c4653g.f22916L;
            c4657k.f22996V = c4653g.f22917M;
            c4657k.f22997W = c4653g.f22914J;
            c4657k.f22998X = c4653g.f22915K;
            c4657k.f22999Y = c4653g.f22918N;
            c4657k.f23000Z = c4653g.f22919O;
            c4657k.f44426f0 = c4653g.f22925U;
            c4657k.f22984J = c4653g.f22951u;
            c4657k.f22986L = c4653g.f22953w;
            c4657k.f22983I = c4653g.f22950t;
            c4657k.f22985K = c4653g.f22952v;
            c4657k.f22988N = c4653g.f22954x;
            c4657k.f22987M = c4653g.f22955y;
            c4657k.f22981G = c4653g.getMarginEnd();
            c4657k.f22982H = c4653g.getMarginStart();
            c4659m.f23032a = childAt.getVisibility();
            c4659m.f23034c = childAt.getAlpha();
            c4660n.f23037a = childAt.getRotation();
            c4660n.f23038b = childAt.getRotationX();
            c4660n.f23039c = childAt.getRotationY();
            c4660n.f23040d = childAt.getScaleX();
            c4660n.f23041e = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                c4660n.f23042f = pivotX;
                c4660n.f23043g = pivotY;
            }
            c4660n.f23044h = childAt.getTranslationX();
            c4660n.f23045i = childAt.getTranslationY();
            c4660n.f23046j = childAt.getTranslationZ();
            if (c4660n.f23047k) {
                c4660n.f23048l = childAt.getElevation();
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                c4657k.f44429i0 = barrier.f2149j.f44384g0;
                c4657k.f44424d0 = barrier.getReferencedIds();
                c4657k.f44421a0 = barrier.getType();
                c4657k.f44422b0 = barrier.getMargin();
            }
            i10++;
            c4661o = this;
        }
    }

    /* renamed from: e */
    public final void m9545e(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C4656j c4656jM9541d = m9541d(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        c4656jM9541d.f22972d.f23001a = true;
                    }
                    this.f23053c.put(Integer.valueOf(c4656jM9541d.f22969a), c4656jM9541d);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e10) {
            e10.printStackTrace();
        }
    }
}

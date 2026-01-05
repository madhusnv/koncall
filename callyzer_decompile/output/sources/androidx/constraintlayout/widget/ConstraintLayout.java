package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import c9.C0910e;
import ch.C0972b;
import com.skydoves.balloon.internals.DefinitionKt;
import j5.C3588e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import k5.C4013h;
import k5.C4014i;
import k5.C4016k;
import m5.AbstractC4650d;
import m5.AbstractC4652f;
import m5.AbstractC4662p;
import m5.AbstractC4664r;
import m5.C4653g;
import m5.C4654h;
import m5.C4655i;
import m5.C4661o;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.iana.AEADAlgorithm;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: a */
    public final SparseArray f2150a;

    /* renamed from: b */
    public final ArrayList f2151b;

    /* renamed from: c */
    public final C4014i f2152c;

    /* renamed from: d */
    public int f2153d;

    /* renamed from: e */
    public int f2154e;

    /* renamed from: f */
    public int f2155f;

    /* renamed from: g */
    public int f2156g;

    /* renamed from: h */
    public boolean f2157h;

    /* renamed from: j */
    public int f2158j;

    /* renamed from: k */
    public C4661o f2159k;

    /* renamed from: l */
    public C0910e f2160l;

    /* renamed from: m */
    public int f2161m;

    /* renamed from: n */
    public HashMap f2162n;

    /* renamed from: p */
    public final SparseArray f2163p;

    /* renamed from: q */
    public final C4654h f2164q;

    public ConstraintLayout(Context context, AttributeSet attributeSet) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet);
        this.f2150a = new SparseArray();
        this.f2151b = new ArrayList(4);
        this.f2152c = new C4014i();
        this.f2153d = 0;
        this.f2154e = 0;
        this.f2155f = Integer.MAX_VALUE;
        this.f2156g = Integer.MAX_VALUE;
        this.f2157h = true;
        this.f2158j = 263;
        this.f2159k = null;
        this.f2160l = null;
        this.f2161m = -1;
        this.f2162n = new HashMap();
        this.f2163p = new SparseArray();
        this.f2164q = new C4654h(this);
        m734c(attributeSet, 0);
    }

    /* renamed from: a */
    public static C4653g m732a() {
        C4653g c4653g = new C4653g(-2, -2);
        c4653g.f22931a = -1;
        c4653g.f22932b = -1;
        c4653g.f22933c = -1.0f;
        c4653g.f22934d = -1;
        c4653g.f22935e = -1;
        c4653g.f22936f = -1;
        c4653g.f22937g = -1;
        c4653g.f22938h = -1;
        c4653g.f22939i = -1;
        c4653g.f22940j = -1;
        c4653g.f22941k = -1;
        c4653g.f22942l = -1;
        c4653g.f22943m = -1;
        c4653g.f22944n = 0;
        c4653g.f22945o = DefinitionKt.NO_Float_VALUE;
        c4653g.f22946p = -1;
        c4653g.f22947q = -1;
        c4653g.f22948r = -1;
        c4653g.f22949s = -1;
        c4653g.f22950t = -1;
        c4653g.f22951u = -1;
        c4653g.f22952v = -1;
        c4653g.f22953w = -1;
        c4653g.f22954x = -1;
        c4653g.f22955y = -1;
        c4653g.f22956z = 0.5f;
        c4653g.f22905A = 0.5f;
        c4653g.f22906B = null;
        c4653g.f22907C = 1;
        c4653g.f22908D = -1.0f;
        c4653g.f22909E = -1.0f;
        c4653g.f22910F = 0;
        c4653g.f22911G = 0;
        c4653g.f22912H = 0;
        c4653g.f22913I = 0;
        c4653g.f22914J = 0;
        c4653g.f22915K = 0;
        c4653g.f22916L = 0;
        c4653g.f22917M = 0;
        c4653g.f22918N = 1.0f;
        c4653g.f22919O = 1.0f;
        c4653g.f22920P = -1;
        c4653g.f22921Q = -1;
        c4653g.f22922R = -1;
        c4653g.f22923S = false;
        c4653g.f22924T = false;
        c4653g.f22925U = null;
        c4653g.f22926V = true;
        c4653g.f22927W = true;
        c4653g.f22928X = false;
        c4653g.f22929Y = false;
        c4653g.f22930Z = false;
        c4653g.f44409a0 = -1;
        c4653g.f44410b0 = -1;
        c4653g.f44411c0 = -1;
        c4653g.f44412d0 = -1;
        c4653g.f44413e0 = -1;
        c4653g.f44414f0 = -1;
        c4653g.f44415g0 = 0.5f;
        c4653g.f44419k0 = new C4013h();
        return c4653g;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    /* renamed from: b */
    public final C4013h m733b(View view) {
        if (view == this) {
            return this.f2152c;
        }
        if (view == null) {
            return null;
        }
        return ((C4653g) view.getLayoutParams()).f44419k0;
    }

    /* renamed from: c */
    public final void m734c(AttributeSet attributeSet, int i10) throws XmlPullParserException, IOException, NumberFormatException {
        C4014i c4014i = this.f2152c;
        c4014i.f20754V = this;
        C4654h c4654h = this.f2164q;
        c4014i.f44392g0 = c4654h;
        c4014i.f44391f0.f3660g = c4654h;
        this.f2150a.put(getId(), this);
        this.f2159k = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC4664r.f23055b, i10, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == 9) {
                    this.f2153d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2153d);
                } else if (index == 10) {
                    this.f2154e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2154e);
                } else if (index == 7) {
                    this.f2155f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2155f);
                } else if (index == 8) {
                    this.f2156g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2156g);
                } else if (index == 89) {
                    this.f2158j = typedArrayObtainStyledAttributes.getInt(index, this.f2158j);
                } else if (index == 38) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m735d(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f2160l = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C4661o c4661o = new C4661o();
                        this.f2159k = c4661o;
                        c4661o.m9545e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f2159k = null;
                    }
                    this.f2161m = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        int i12 = this.f2158j;
        c4014i.f44401p0 = i12;
        C3588e.f19170p = (i12 & 256) == 256;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C4653g;
    }

    /* renamed from: d */
    public final void m735d(int i10) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
        String str;
        Context context = getContext();
        C0910e c0910e = new C0910e(10, false);
        c0910e.f5579b = new SparseArray();
        c0910e.f5580c = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            C0972b c0972b = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c0910e.m2584C(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 80204913:
                            if (name.equals("State")) {
                                c0972b = new C0972b(context, xml);
                                ((SparseArray) c0910e.f5579b).put(c0972b.f5783b, c0972b);
                                break;
                            } else {
                                break;
                            }
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                C4655i c4655i = new C4655i(context, xml);
                                if (c0972b != null) {
                                    ((ArrayList) c0972b.f5785d).add(c4655i);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                    }
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e10) {
            e10.printStackTrace();
        }
        this.f2160l = c0910e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) throws NumberFormatException {
        Object tag;
        int size;
        ArrayList arrayList = this.f2151b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                ((AbstractC4650d) arrayList.get(i10)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i12 = Integer.parseInt(strArrSplit[0]);
                        int i13 = Integer.parseInt(strArrSplit[1]);
                        int i14 = Integer.parseInt(strArrSplit[2]);
                        int i15 = (int) ((i12 / 1080.0f) * width);
                        int i16 = (int) ((i13 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f6 = i15;
                        float f10 = i16;
                        float f11 = i15 + ((int) ((i14 / 1080.0f) * width));
                        canvas.drawLine(f6, f10, f11, f10, paint);
                        float f12 = i16 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f11, f10, f11, f12, paint);
                        canvas.drawLine(f11, f12, f6, f12, paint);
                        canvas.drawLine(f6, f12, f6, f10, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f6, f10, f11, f12, paint);
                        canvas.drawLine(f6, f12, f11, f10, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f2157h = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m732a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) throws NumberFormatException {
        int i10;
        Context context = getContext();
        C4653g c4653g = new C4653g(context, attributeSet);
        c4653g.f22931a = -1;
        c4653g.f22932b = -1;
        c4653g.f22933c = -1.0f;
        c4653g.f22934d = -1;
        c4653g.f22935e = -1;
        c4653g.f22936f = -1;
        c4653g.f22937g = -1;
        c4653g.f22938h = -1;
        c4653g.f22939i = -1;
        c4653g.f22940j = -1;
        c4653g.f22941k = -1;
        c4653g.f22942l = -1;
        c4653g.f22943m = -1;
        c4653g.f22944n = 0;
        c4653g.f22945o = DefinitionKt.NO_Float_VALUE;
        c4653g.f22946p = -1;
        c4653g.f22947q = -1;
        c4653g.f22948r = -1;
        c4653g.f22949s = -1;
        c4653g.f22950t = -1;
        c4653g.f22951u = -1;
        c4653g.f22952v = -1;
        c4653g.f22953w = -1;
        c4653g.f22954x = -1;
        c4653g.f22955y = -1;
        c4653g.f22956z = 0.5f;
        c4653g.f22905A = 0.5f;
        c4653g.f22906B = null;
        c4653g.f22907C = 1;
        c4653g.f22908D = -1.0f;
        c4653g.f22909E = -1.0f;
        c4653g.f22910F = 0;
        c4653g.f22911G = 0;
        c4653g.f22912H = 0;
        c4653g.f22913I = 0;
        c4653g.f22914J = 0;
        c4653g.f22915K = 0;
        c4653g.f22916L = 0;
        c4653g.f22917M = 0;
        c4653g.f22918N = 1.0f;
        c4653g.f22919O = 1.0f;
        c4653g.f22920P = -1;
        c4653g.f22921Q = -1;
        c4653g.f22922R = -1;
        c4653g.f22923S = false;
        c4653g.f22924T = false;
        c4653g.f22925U = null;
        c4653g.f22926V = true;
        c4653g.f22927W = true;
        c4653g.f22928X = false;
        c4653g.f22929Y = false;
        c4653g.f22930Z = false;
        c4653g.f44409a0 = -1;
        c4653g.f44410b0 = -1;
        c4653g.f44411c0 = -1;
        c4653g.f44412d0 = -1;
        c4653g.f44413e0 = -1;
        c4653g.f44414f0 = -1;
        c4653g.f44415g0 = 0.5f;
        c4653g.f44419k0 = new C4013h();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4664r.f23055b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            int i12 = AbstractC4652f.f22904a.get(index);
            switch (i12) {
                case 1:
                    c4653g.f22922R = typedArrayObtainStyledAttributes.getInt(index, c4653g.f22922R);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c4653g.f22943m);
                    c4653g.f22943m = resourceId;
                    if (resourceId == -1) {
                        c4653g.f22943m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    c4653g.f22944n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4653g.f22944n);
                    break;
                case 4:
                    float f6 = typedArrayObtainStyledAttributes.getFloat(index, c4653g.f22945o) % 360.0f;
                    c4653g.f22945o = f6;
                    if (f6 < DefinitionKt.NO_Float_VALUE) {
                        c4653g.f22945o = (360.0f - f6) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    c4653g.f22931a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c4653g.f22931a);
                    break;
                case 6:
                    c4653g.f22932b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c4653g.f22932b);
                    break;
                case 7:
                    c4653g.f22933c = typedArrayObtainStyledAttributes.getFloat(index, c4653g.f22933c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, c4653g.f22934d);
                    c4653g.f22934d = resourceId2;
                    if (resourceId2 == -1) {
                        c4653g.f22934d = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, c4653g.f22935e);
                    c4653g.f22935e = resourceId3;
                    if (resourceId3 == -1) {
                        c4653g.f22935e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, c4653g.f22936f);
                    c4653g.f22936f = resourceId4;
                    if (resourceId4 == -1) {
                        c4653g.f22936f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, c4653g.f22937g);
                    c4653g.f22937g = resourceId5;
                    if (resourceId5 == -1) {
                        c4653g.f22937g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, c4653g.f22938h);
                    c4653g.f22938h = resourceId6;
                    if (resourceId6 == -1) {
                        c4653g.f22938h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, c4653g.f22939i);
                    c4653g.f22939i = resourceId7;
                    if (resourceId7 == -1) {
                        c4653g.f22939i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, c4653g.f22940j);
                    c4653g.f22940j = resourceId8;
                    if (resourceId8 == -1) {
                        c4653g.f22940j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, c4653g.f22941k);
                    c4653g.f22941k = resourceId9;
                    if (resourceId9 == -1) {
                        c4653g.f22941k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, c4653g.f22942l);
                    c4653g.f22942l = resourceId10;
                    if (resourceId10 == -1) {
                        c4653g.f22942l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, c4653g.f22946p);
                    c4653g.f22946p = resourceId11;
                    if (resourceId11 == -1) {
                        c4653g.f22946p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, c4653g.f22947q);
                    c4653g.f22947q = resourceId12;
                    if (resourceId12 == -1) {
                        c4653g.f22947q = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, c4653g.f22948r);
                    c4653g.f22948r = resourceId13;
                    if (resourceId13 == -1) {
                        c4653g.f22948r = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, c4653g.f22949s);
                    c4653g.f22949s = resourceId14;
                    if (resourceId14 == -1) {
                        c4653g.f22949s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    c4653g.f22950t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4653g.f22950t);
                    break;
                case 22:
                    c4653g.f22951u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4653g.f22951u);
                    break;
                case 23:
                    c4653g.f22952v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4653g.f22952v);
                    break;
                case 24:
                    c4653g.f22953w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4653g.f22953w);
                    break;
                case 25:
                    c4653g.f22954x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4653g.f22954x);
                    break;
                case 26:
                    c4653g.f22955y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4653g.f22955y);
                    break;
                case 27:
                    c4653g.f22923S = typedArrayObtainStyledAttributes.getBoolean(index, c4653g.f22923S);
                    break;
                case 28:
                    c4653g.f22924T = typedArrayObtainStyledAttributes.getBoolean(index, c4653g.f22924T);
                    break;
                case 29:
                    c4653g.f22956z = typedArrayObtainStyledAttributes.getFloat(index, c4653g.f22956z);
                    break;
                case 30:
                    c4653g.f22905A = typedArrayObtainStyledAttributes.getFloat(index, c4653g.f22905A);
                    break;
                case BERTags.DATE /* 31 */:
                    c4653g.f22912H = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 32:
                    c4653g.f22913I = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case BERTags.DATE_TIME /* 33 */:
                    try {
                        c4653g.f22914J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4653g.f22914J);
                        break;
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c4653g.f22914J) == -2) {
                            c4653g.f22914J = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case BERTags.DURATION /* 34 */:
                    try {
                        c4653g.f22916L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4653g.f22916L);
                        break;
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c4653g.f22916L) == -2) {
                            c4653g.f22916L = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case BERTags.OBJECT_IDENTIFIER_IRI /* 35 */:
                    c4653g.f22918N = Math.max(DefinitionKt.NO_Float_VALUE, typedArrayObtainStyledAttributes.getFloat(index, c4653g.f22918N));
                    c4653g.f22912H = 2;
                    break;
                case BERTags.RELATIVE_OID_IRI /* 36 */:
                    try {
                        c4653g.f22915K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4653g.f22915K);
                        break;
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c4653g.f22915K) == -2) {
                            c4653g.f22915K = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        c4653g.f22917M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4653g.f22917M);
                        break;
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c4653g.f22917M) == -2) {
                            c4653g.f22917M = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    c4653g.f22919O = Math.max(DefinitionKt.NO_Float_VALUE, typedArrayObtainStyledAttributes.getFloat(index, c4653g.f22919O));
                    c4653g.f22913I = 2;
                    break;
                default:
                    switch (i12) {
                        case 44:
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            c4653g.f22906B = string;
                            c4653g.f22907C = -1;
                            if (string != null) {
                                int length = string.length();
                                int iIndexOf = c4653g.f22906B.indexOf(44);
                                if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                    i10 = 0;
                                } else {
                                    String strSubstring = c4653g.f22906B.substring(0, iIndexOf);
                                    if (strSubstring.equalsIgnoreCase("W")) {
                                        c4653g.f22907C = 0;
                                    } else if (strSubstring.equalsIgnoreCase("H")) {
                                        c4653g.f22907C = 1;
                                    }
                                    i10 = iIndexOf + 1;
                                }
                                int iIndexOf2 = c4653g.f22906B.indexOf(58);
                                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                                    String strSubstring2 = c4653g.f22906B.substring(i10);
                                    if (strSubstring2.length() > 0) {
                                        Float.parseFloat(strSubstring2);
                                        break;
                                    } else {
                                        break;
                                    }
                                } else {
                                    String strSubstring3 = c4653g.f22906B.substring(i10, iIndexOf2);
                                    String strSubstring4 = c4653g.f22906B.substring(iIndexOf2 + 1);
                                    if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                                        break;
                                    } else {
                                        try {
                                            float f10 = Float.parseFloat(strSubstring3);
                                            float f11 = Float.parseFloat(strSubstring4);
                                            if (f10 <= DefinitionKt.NO_Float_VALUE || f11 <= DefinitionKt.NO_Float_VALUE) {
                                                break;
                                            } else if (c4653g.f22907C == 1) {
                                                Math.abs(f11 / f10);
                                                break;
                                            } else {
                                                Math.abs(f10 / f11);
                                                break;
                                            }
                                        } catch (NumberFormatException unused5) {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                break;
                            }
                            break;
                        case 45:
                            c4653g.f22908D = typedArrayObtainStyledAttributes.getFloat(index, c4653g.f22908D);
                            break;
                        case 46:
                            c4653g.f22909E = typedArrayObtainStyledAttributes.getFloat(index, c4653g.f22909E);
                            break;
                        case 47:
                            c4653g.f22910F = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            c4653g.f22911G = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c4653g.f22920P = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c4653g.f22920P);
                            break;
                        case 50:
                            c4653g.f22921Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c4653g.f22921Q);
                            break;
                        case 51:
                            c4653g.f22925U = typedArrayObtainStyledAttributes.getString(index);
                            break;
                    }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        c4653g.m9533a();
        return c4653g;
    }

    public int getMaxHeight() {
        return this.f2156g;
    }

    public int getMaxWidth() {
        return this.f2155f;
    }

    public int getMinHeight() {
        return this.f2154e;
    }

    public int getMinWidth() {
        return this.f2153d;
    }

    public int getOptimizationLevel() {
        return this.f2152c.f44401p0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            C4653g c4653g = (C4653g) childAt.getLayoutParams();
            C4013h c4013h = c4653g.f44419k0;
            if (childAt.getVisibility() != 8 || c4653g.f22929Y || c4653g.f22930Z || zIsInEditMode) {
                int iM8801k = c4013h.m8801k();
                int iM8802l = c4013h.m8802l();
                childAt.layout(iM8801k, iM8802l, c4013h.m8800j() + iM8801k, c4013h.m8797g() + iM8802l);
            }
        }
        ArrayList arrayList = this.f2151b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                ((AbstractC4650d) arrayList.get(i15)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0768  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x07d6  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x084d A[PHI: r10 r12
      0x084d: PHI (r10v8 boolean) = (r10v7 boolean), (r10v34 boolean) binds: [B:401:0x07e4, B:705:0x084d] A[DONT_GENERATE, DONT_INLINE]
      0x084d: PHI (r12v8 int) = (r12v7 int), (r12v46 int) binds: [B:401:0x07e4, B:705:0x084d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0855 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0857 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0abe  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0acc  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0acf  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0ad1  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x0b4c  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0b51  */
    /* JADX WARN: Removed duplicated region for block: B:660:0x0ca0  */
    /* JADX WARN: Removed duplicated region for block: B:661:0x0ca2  */
    /* JADX WARN: Removed duplicated region for block: B:665:0x0cdd  */
    /* JADX WARN: Removed duplicated region for block: B:667:0x0ce0  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r35, int r36) throws android.content.res.Resources.NotFoundException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 3301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C4013h c4013hM733b = m733b(view);
        if ((view instanceof Guideline) && !(c4013hM733b instanceof C4016k)) {
            C4653g c4653g = (C4653g) view.getLayoutParams();
            C4016k c4016k = new C4016k();
            c4653g.f44419k0 = c4016k;
            c4653g.f22929Y = true;
            c4016k.m8819y(c4653g.f22922R);
        }
        if (view instanceof AbstractC4650d) {
            AbstractC4650d abstractC4650d = (AbstractC4650d) view;
            abstractC4650d.m9532d();
            ((C4653g) view.getLayoutParams()).f22930Z = true;
            ArrayList arrayList = this.f2151b;
            if (!arrayList.contains(abstractC4650d)) {
                arrayList.add(abstractC4650d);
            }
        }
        this.f2150a.put(view.getId(), view);
        this.f2157h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f2150a.remove(view.getId());
        C4013h c4013hM733b = m733b(view);
        this.f2152c.f44389d0.remove(c4013hM733b);
        c4013hM733b.f20742J = null;
        this.f2151b.remove(view);
        this.f2157h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f2157h = true;
        super.requestLayout();
    }

    public void setConstraintSet(C4661o c4661o) {
        this.f2159k = c4661o;
    }

    @Override // android.view.View
    public void setId(int i10) {
        int id2 = getId();
        SparseArray sparseArray = this.f2150a;
        sparseArray.remove(id2);
        super.setId(i10);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.f2156g) {
            return;
        }
        this.f2156g = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f2155f) {
            return;
        }
        this.f2155f = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f2154e) {
            return;
        }
        this.f2154e = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f2153d) {
            return;
        }
        this.f2153d = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC4662p abstractC4662p) {
        C0910e c0910e = this.f2160l;
        if (c0910e != null) {
            c0910e.getClass();
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f2158j = i10;
        this.f2152c.f44401p0 = i10;
        C3588e.f19170p = (i10 & 256) == 256;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet, i10);
        this.f2150a = new SparseArray();
        this.f2151b = new ArrayList(4);
        this.f2152c = new C4014i();
        this.f2153d = 0;
        this.f2154e = 0;
        this.f2155f = Integer.MAX_VALUE;
        this.f2156g = Integer.MAX_VALUE;
        this.f2157h = true;
        this.f2158j = 263;
        this.f2159k = null;
        this.f2160l = null;
        this.f2161m = -1;
        this.f2162n = new HashMap();
        this.f2163p = new SparseArray();
        this.f2164q = new C4654h(this);
        m734c(attributeSet, i10);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C4653g c4653g = new C4653g(layoutParams);
        c4653g.f22931a = -1;
        c4653g.f22932b = -1;
        c4653g.f22933c = -1.0f;
        c4653g.f22934d = -1;
        c4653g.f22935e = -1;
        c4653g.f22936f = -1;
        c4653g.f22937g = -1;
        c4653g.f22938h = -1;
        c4653g.f22939i = -1;
        c4653g.f22940j = -1;
        c4653g.f22941k = -1;
        c4653g.f22942l = -1;
        c4653g.f22943m = -1;
        c4653g.f22944n = 0;
        c4653g.f22945o = DefinitionKt.NO_Float_VALUE;
        c4653g.f22946p = -1;
        c4653g.f22947q = -1;
        c4653g.f22948r = -1;
        c4653g.f22949s = -1;
        c4653g.f22950t = -1;
        c4653g.f22951u = -1;
        c4653g.f22952v = -1;
        c4653g.f22953w = -1;
        c4653g.f22954x = -1;
        c4653g.f22955y = -1;
        c4653g.f22956z = 0.5f;
        c4653g.f22905A = 0.5f;
        c4653g.f22906B = null;
        c4653g.f22907C = 1;
        c4653g.f22908D = -1.0f;
        c4653g.f22909E = -1.0f;
        c4653g.f22910F = 0;
        c4653g.f22911G = 0;
        c4653g.f22912H = 0;
        c4653g.f22913I = 0;
        c4653g.f22914J = 0;
        c4653g.f22915K = 0;
        c4653g.f22916L = 0;
        c4653g.f22917M = 0;
        c4653g.f22918N = 1.0f;
        c4653g.f22919O = 1.0f;
        c4653g.f22920P = -1;
        c4653g.f22921Q = -1;
        c4653g.f22922R = -1;
        c4653g.f22923S = false;
        c4653g.f22924T = false;
        c4653g.f22925U = null;
        c4653g.f22926V = true;
        c4653g.f22927W = true;
        c4653g.f22928X = false;
        c4653g.f22929Y = false;
        c4653g.f22930Z = false;
        c4653g.f44409a0 = -1;
        c4653g.f44410b0 = -1;
        c4653g.f44411c0 = -1;
        c4653g.f44412d0 = -1;
        c4653g.f44413e0 = -1;
        c4653g.f44414f0 = -1;
        c4653g.f44415g0 = 0.5f;
        c4653g.f44419k0 = new C4013h();
        return c4653g;
    }
}

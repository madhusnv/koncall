package p001o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p001o.ykf;

/* loaded from: classes3.dex */
public class w4g {

    /* renamed from: a */
    public final int f51474a;

    /* renamed from: b */
    public final ykf f51475b;

    /* renamed from: c */
    public final int[][] f51476c;

    /* renamed from: d */
    public final ykf[] f51477d;

    /* renamed from: e */
    public final v4g f51478e;

    /* renamed from: f */
    public final v4g f51479f;

    /* renamed from: g */
    public final v4g f51480g;

    /* renamed from: h */
    public final v4g f51481h;

    /* renamed from: o.w4g$b */
    public static final class C17779b {

        /* renamed from: a */
        public int f51482a;

        /* renamed from: b */
        public ykf f51483b;

        /* renamed from: c */
        public int[][] f51484c;

        /* renamed from: d */
        public ykf[] f51485d;

        /* renamed from: e */
        public v4g f51486e;

        /* renamed from: f */
        public v4g f51487f;

        /* renamed from: g */
        public v4g f51488g;

        /* renamed from: h */
        public v4g f51489h;

        /* renamed from: i */
        public C17779b m53955i(int[] iArr, ykf ykfVar) {
            int i = this.f51482a;
            if (i == 0 || iArr.length == 0) {
                this.f51483b = ykfVar;
            }
            if (i >= this.f51484c.length) {
                m53958l(i, i + 10);
            }
            int[][] iArr2 = this.f51484c;
            int i2 = this.f51482a;
            iArr2[i2] = iArr;
            this.f51485d[i2] = ykfVar;
            this.f51482a = i2 + 1;
            return this;
        }

        /* renamed from: j */
        public w4g m53956j() {
            if (this.f51482a == 0) {
                return null;
            }
            return new w4g(this);
        }

        /* renamed from: k */
        public final boolean m53957k(int i, int i2) {
            return (i2 | i) == i;
        }

        /* renamed from: l */
        public final void m53958l(int i, int i2) {
            int[][] iArr = new int[i2][];
            System.arraycopy(this.f51484c, 0, iArr, 0, i);
            this.f51484c = iArr;
            ykf[] ykfVarArr = new ykf[i2];
            System.arraycopy(this.f51485d, 0, ykfVarArr, 0, i);
            this.f51485d = ykfVarArr;
        }

        /* renamed from: m */
        public final void m53959m() {
            this.f51483b = new ykf();
            this.f51484c = new int[10][];
            this.f51485d = new ykf[10];
        }

        /* renamed from: n */
        public C17779b m53960n(v4g v4gVar, int i) {
            if (m53957k(i, 1)) {
                this.f51486e = v4gVar;
            }
            if (m53957k(i, 2)) {
                this.f51487f = v4gVar;
            }
            if (m53957k(i, 4)) {
                this.f51488g = v4gVar;
            }
            if (m53957k(i, 8)) {
                this.f51489h = v4gVar;
            }
            return this;
        }

        public C17779b(w4g w4gVar) {
            int i = w4gVar.f51474a;
            this.f51482a = i;
            this.f51483b = w4gVar.f51475b;
            int[][] iArr = w4gVar.f51476c;
            int[][] iArr2 = new int[iArr.length][];
            this.f51484c = iArr2;
            this.f51485d = new ykf[w4gVar.f51477d.length];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(w4gVar.f51477d, 0, this.f51485d, 0, this.f51482a);
            this.f51486e = w4gVar.f51478e;
            this.f51487f = w4gVar.f51479f;
            this.f51488g = w4gVar.f51480g;
            this.f51489h = w4gVar.f51481h;
        }

        public C17779b(ykf ykfVar) {
            m53959m();
            m53955i(StateSet.WILD_CARD, ykfVar);
        }

        public C17779b(Context context, int i) throws Resources.NotFoundException {
            int next;
            m53959m();
            try {
                XmlResourceParser xml = context.getResources().getXml(i);
                try {
                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                    do {
                        next = xml.next();
                        if (next == 2) {
                            break;
                        }
                    } while (next != 1);
                    if (next == 2) {
                        if (xml.getName().equals("selector")) {
                            w4g.m53940g(this, context, xml, attributeSetAsAttributeSet, context.getTheme());
                        }
                        xml.close();
                        return;
                    }
                    throw new XmlPullParserException("No start tag found");
                } catch (Throwable th) {
                    if (xml != null) {
                        try {
                            xml.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                m53959m();
            }
        }
    }

    /* renamed from: b */
    public static w4g m53939b(Context context, TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId != 0 && Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return new C17779b(context, resourceId).m53956j();
        }
        return null;
    }

    /* renamed from: g */
    public static void m53940g(C17779b c17779b, Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, ebe.MaterialShape) : theme.obtainStyledAttributes(attributeSet, ebe.MaterialShape, 0, 0);
                ykf ykfVarM57970m = ykf.m57922b(context, typedArrayObtainAttributes.getResourceId(ebe.MaterialShape_shapeAppearance, 0), typedArrayObtainAttributes.getResourceId(ebe.MaterialShape_shapeAppearanceOverlay, 0)).m57970m();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != x5e.shapeAppearance && attributeNameResource != x5e.shapeAppearanceOverlay) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i] = attributeNameResource;
                        i = i3;
                    }
                }
                c17779b.m53955i(StateSet.trimStateSet(iArr, i), ykfVarM57970m);
            }
        }
    }

    /* renamed from: h */
    public static int m53941h(int i) {
        int i2 = i & 5;
        return ((i & 10) >> 1) | (i2 << 1);
    }

    /* renamed from: c */
    public ykf m53942c(boolean z) {
        if (!z || (this.f51478e == null && this.f51479f == null && this.f51480g == null && this.f51481h == null)) {
            return this.f51475b;
        }
        ykf.C18426b c18426bM57943w = this.f51475b.m57943w();
        v4g v4gVar = this.f51478e;
        if (v4gVar != null) {
            c18426bM57943w.m57965F(v4gVar.m52323e());
        }
        v4g v4gVar2 = this.f51479f;
        if (v4gVar2 != null) {
            c18426bM57943w.m57969J(v4gVar2.m52323e());
        }
        v4g v4gVar3 = this.f51480g;
        if (v4gVar3 != null) {
            c18426bM57943w.m57979w(v4gVar3.m52323e());
        }
        v4g v4gVar4 = this.f51481h;
        if (v4gVar4 != null) {
            c18426bM57943w.m57960A(v4gVar4.m52323e());
        }
        return c18426bM57943w.m57970m();
    }

    /* renamed from: d */
    public ykf m53943d(int[] iArr) {
        int iM53944e = m53944e(iArr);
        if (iM53944e < 0) {
            iM53944e = m53944e(StateSet.WILD_CARD);
        }
        if (this.f51478e == null && this.f51479f == null && this.f51480g == null && this.f51481h == null) {
            return this.f51477d[iM53944e];
        }
        ykf.C18426b c18426bM57943w = this.f51477d[iM53944e].m57943w();
        v4g v4gVar = this.f51478e;
        if (v4gVar != null) {
            c18426bM57943w.m57965F(v4gVar.m52322d(iArr));
        }
        v4g v4gVar2 = this.f51479f;
        if (v4gVar2 != null) {
            c18426bM57943w.m57969J(v4gVar2.m52322d(iArr));
        }
        v4g v4gVar3 = this.f51480g;
        if (v4gVar3 != null) {
            c18426bM57943w.m57979w(v4gVar3.m52322d(iArr));
        }
        v4g v4gVar4 = this.f51481h;
        if (v4gVar4 != null) {
            c18426bM57943w.m57960A(v4gVar4.m52322d(iArr));
        }
        return c18426bM57943w.m57970m();
    }

    /* renamed from: e */
    public final int m53944e(int[] iArr) {
        int[][] iArr2 = this.f51476c;
        for (int i = 0; i < this.f51474a; i++) {
            if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: f */
    public boolean m53945f() {
        if (this.f51474a > 1) {
            return true;
        }
        v4g v4gVar = this.f51478e;
        if (v4gVar != null && v4gVar.m52326h()) {
            return true;
        }
        v4g v4gVar2 = this.f51479f;
        if (v4gVar2 != null && v4gVar2.m52326h()) {
            return true;
        }
        v4g v4gVar3 = this.f51480g;
        if (v4gVar3 != null && v4gVar3.m52326h()) {
            return true;
        }
        v4g v4gVar4 = this.f51481h;
        return v4gVar4 != null && v4gVar4.m52326h();
    }

    /* renamed from: i */
    public C17779b m53946i() {
        return new C17779b(this);
    }

    public w4g(C17779b c17779b) {
        this.f51474a = c17779b.f51482a;
        this.f51475b = c17779b.f51483b;
        this.f51476c = c17779b.f51484c;
        this.f51477d = c17779b.f51485d;
        this.f51478e = c17779b.f51486e;
        this.f51479f = c17779b.f51487f;
        this.f51480g = c17779b.f51488g;
        this.f51481h = c17779b.f51489h;
    }
}

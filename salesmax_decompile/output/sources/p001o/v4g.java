package p001o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public class v4g {

    /* renamed from: a */
    public int f49869a;

    /* renamed from: b */
    public n74 f49870b;

    /* renamed from: c */
    public int[][] f49871c = new int[10][];

    /* renamed from: d */
    public n74[] f49872d = new n74[10];

    /* renamed from: b */
    public static v4g m52319b(Context context, TypedArray typedArray, int i, n74 n74Var) throws Resources.NotFoundException {
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0) {
            return m52320c(ykf.m57928m(typedArray, i, n74Var));
        }
        if (!context.getResources().getResourceTypeName(resourceId).equals("xml")) {
            return m52320c(ykf.m57928m(typedArray, i, n74Var));
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                v4g v4gVar = new v4g();
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (xml.getName().equals("selector")) {
                    v4gVar.m52327i(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                xml.close();
                return v4gVar;
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
            return m52320c(n74Var);
        }
    }

    /* renamed from: c */
    public static v4g m52320c(n74 n74Var) {
        v4g v4gVar = new v4g();
        v4gVar.m52321a(StateSet.WILD_CARD, n74Var);
        return v4gVar;
    }

    /* renamed from: a */
    public final void m52321a(int[] iArr, n74 n74Var) {
        int i = this.f49869a;
        if (i == 0 || iArr.length == 0) {
            this.f49870b = n74Var;
        }
        if (i >= this.f49871c.length) {
            m52324f(i, i + 10);
        }
        int[][] iArr2 = this.f49871c;
        int i2 = this.f49869a;
        iArr2[i2] = iArr;
        this.f49872d[i2] = n74Var;
        this.f49869a = i2 + 1;
    }

    /* renamed from: d */
    public n74 m52322d(int[] iArr) {
        int iM52325g = m52325g(iArr);
        if (iM52325g < 0) {
            iM52325g = m52325g(StateSet.WILD_CARD);
        }
        return iM52325g < 0 ? this.f49870b : this.f49872d[iM52325g];
    }

    /* renamed from: e */
    public n74 m52323e() {
        return this.f49870b;
    }

    /* renamed from: f */
    public final void m52324f(int i, int i2) {
        int[][] iArr = new int[i2][];
        System.arraycopy(this.f49871c, 0, iArr, 0, i);
        this.f49871c = iArr;
        n74[] n74VarArr = new n74[i2];
        System.arraycopy(this.f49872d, 0, n74VarArr, 0, i);
        this.f49872d = n74VarArr;
    }

    /* renamed from: g */
    public final int m52325g(int[] iArr) {
        int[][] iArr2 = this.f49871c;
        for (int i = 0; i < this.f49869a; i++) {
            if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: h */
    public boolean m52326h() {
        return this.f49869a > 1;
    }

    /* renamed from: i */
    public final void m52327i(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, ebe.ShapeAppearance) : theme.obtainStyledAttributes(attributeSet, ebe.ShapeAppearance, 0, 0);
                n74 n74VarM57928m = ykf.m57928m(typedArrayObtainAttributes, ebe.ShapeAppearance_cornerSize, new o6(0.0f));
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != x5e.cornerSize) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i] = attributeNameResource;
                        i = i3;
                    }
                }
                m52321a(StateSet.trimStateSet(iArr, i), n74VarM57928m);
            }
        }
    }
}

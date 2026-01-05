package p001o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public class x4g {

    /* renamed from: a */
    public int f53190a;

    /* renamed from: b */
    public C18050a f53191b;

    /* renamed from: c */
    public int[][] f53192c = new int[10][];

    /* renamed from: d */
    public C18050a[] f53193d = new C18050a[10];

    /* renamed from: o.x4g$a */
    public static class C18050a {

        /* renamed from: a */
        public C18051b f53194a;

        public C18050a(C18051b c18051b) {
            this.f53194a = c18051b;
        }
    }

    /* renamed from: o.x4g$b */
    public static class C18051b {

        /* renamed from: a */
        public EnumC18052c f53195a;

        /* renamed from: b */
        public float f53196b;

        public C18051b(EnumC18052c enumC18052c, float f) {
            this.f53195a = enumC18052c;
            this.f53196b = f;
        }

        /* renamed from: a */
        public int m55638a(int i) {
            EnumC18052c enumC18052c = this.f53195a;
            if (enumC18052c == EnumC18052c.PERCENT) {
                return (int) (this.f53196b * i);
            }
            if (enumC18052c == EnumC18052c.PIXELS) {
                return (int) this.f53196b;
            }
            return 0;
        }
    }

    /* renamed from: o.x4g$c */
    public enum EnumC18052c {
        PERCENT,
        PIXELS
    }

    /* renamed from: b */
    public static x4g m55630b(Context context, TypedArray typedArray, int i) throws Resources.NotFoundException {
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !context.getResources().getResourceTypeName(resourceId).equals("xml")) {
            return null;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                x4g x4gVar = new x4g();
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
                    x4gVar.m55637h(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                xml.close();
                return x4gVar;
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
            return null;
        }
    }

    /* renamed from: a */
    public final void m55631a(int[] iArr, C18050a c18050a) {
        int i = this.f53190a;
        if (i == 0 || iArr.length == 0) {
            this.f53191b = c18050a;
        }
        if (i >= this.f53192c.length) {
            m55635f(i, i + 10);
        }
        int[][] iArr2 = this.f53192c;
        int i2 = this.f53190a;
        iArr2[i2] = iArr;
        this.f53193d[i2] = c18050a;
        this.f53190a = i2 + 1;
    }

    /* renamed from: c */
    public int m55632c(int i) {
        float fMax;
        int i2 = -i;
        for (int i3 = 0; i3 < this.f53190a; i3++) {
            C18051b c18051b = this.f53193d[i3].f53194a;
            EnumC18052c enumC18052c = c18051b.f53195a;
            if (enumC18052c == EnumC18052c.PIXELS) {
                fMax = Math.max(i2, c18051b.f53196b);
            } else if (enumC18052c == EnumC18052c.PERCENT) {
                fMax = Math.max(i2, i * c18051b.f53196b);
            }
            i2 = (int) fMax;
        }
        return i2;
    }

    /* renamed from: d */
    public final C18051b m55633d(TypedArray typedArray, int i, C18051b c18051b) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue == null) {
            return c18051b;
        }
        int i2 = typedValuePeekValue.type;
        return i2 == 5 ? new C18051b(EnumC18052c.PIXELS, TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new C18051b(EnumC18052c.PERCENT, typedValuePeekValue.getFraction(1.0f, 1.0f)) : c18051b;
    }

    /* renamed from: e */
    public C18050a m55634e(int[] iArr) {
        int iM55636g = m55636g(iArr);
        if (iM55636g < 0) {
            iM55636g = m55636g(StateSet.WILD_CARD);
        }
        return iM55636g < 0 ? this.f53191b : this.f53193d[iM55636g];
    }

    /* renamed from: f */
    public final void m55635f(int i, int i2) {
        int[][] iArr = new int[i2][];
        System.arraycopy(this.f53192c, 0, iArr, 0, i);
        this.f53192c = iArr;
        C18050a[] c18050aArr = new C18050a[i2];
        System.arraycopy(this.f53193d, 0, c18050aArr, 0, i);
        this.f53193d = c18050aArr;
    }

    /* renamed from: g */
    public final int m55636g(int[] iArr) {
        int[][] iArr2 = this.f53192c;
        for (int i = 0; i < this.f53190a; i++) {
            if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: h */
    public final void m55637h(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, ebe.StateListSizeChange) : theme.obtainStyledAttributes(attributeSet, ebe.StateListSizeChange, 0, 0);
                C18051b c18051bM55633d = m55633d(typedArrayObtainAttributes, ebe.StateListSizeChange_widthChange, null);
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != x5e.widthChange) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i] = attributeNameResource;
                        i = i3;
                    }
                }
                m55631a(StateSet.trimStateSet(iArr, i), new C18050a(c18051bM55633d));
            }
        }
    }
}

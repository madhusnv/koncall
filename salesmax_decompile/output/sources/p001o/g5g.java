package p001o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class g5g {

    /* renamed from: a */
    public int f24607a = -1;

    /* renamed from: b */
    public int f24608b = -1;

    /* renamed from: c */
    public int f24609c = -1;

    /* renamed from: d */
    public SparseArray f24610d = new SparseArray();

    /* renamed from: o.g5g$a */
    public static class C13625a {

        /* renamed from: a */
        public int f24611a;

        /* renamed from: b */
        public ArrayList f24612b = new ArrayList();

        /* renamed from: c */
        public int f24613c;

        /* renamed from: d */
        public boolean f24614d;

        public C13625a(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
            this.f24613c = -1;
            this.f24614d = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), mbe.State);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == mbe.State_android_id) {
                    this.f24611a = typedArrayObtainStyledAttributes.getResourceId(index, this.f24611a);
                } else if (index == mbe.State_constraints) {
                    this.f24613c = typedArrayObtainStyledAttributes.getResourceId(index, this.f24613c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f24613c);
                    context.getResources().getResourceName(this.f24613c);
                    if ("layout".equals(resourceTypeName)) {
                        this.f24614d = true;
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public void m28080a(C13626b c13626b) {
            this.f24612b.add(c13626b);
        }

        /* renamed from: b */
        public int m28081b(float f, float f2) {
            for (int i = 0; i < this.f24612b.size(); i++) {
                if (((C13626b) this.f24612b.get(i)).m28082a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: o.g5g$b */
    public static class C13626b {

        /* renamed from: a */
        public float f24615a;

        /* renamed from: b */
        public float f24616b;

        /* renamed from: c */
        public float f24617c;

        /* renamed from: d */
        public float f24618d;

        /* renamed from: e */
        public int f24619e;

        /* renamed from: f */
        public boolean f24620f;

        public C13626b(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
            this.f24615a = Float.NaN;
            this.f24616b = Float.NaN;
            this.f24617c = Float.NaN;
            this.f24618d = Float.NaN;
            this.f24619e = -1;
            this.f24620f = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), mbe.Variant);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == mbe.Variant_constraints) {
                    this.f24619e = typedArrayObtainStyledAttributes.getResourceId(index, this.f24619e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f24619e);
                    context.getResources().getResourceName(this.f24619e);
                    if ("layout".equals(resourceTypeName)) {
                        this.f24620f = true;
                    }
                } else if (index == mbe.Variant_region_heightLessThan) {
                    this.f24618d = typedArrayObtainStyledAttributes.getDimension(index, this.f24618d);
                } else if (index == mbe.Variant_region_heightMoreThan) {
                    this.f24616b = typedArrayObtainStyledAttributes.getDimension(index, this.f24616b);
                } else if (index == mbe.Variant_region_widthLessThan) {
                    this.f24617c = typedArrayObtainStyledAttributes.getDimension(index, this.f24617c);
                } else if (index == mbe.Variant_region_widthMoreThan) {
                    this.f24615a = typedArrayObtainStyledAttributes.getDimension(index, this.f24615a);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public boolean m28082a(float f, float f2) {
            if (!Float.isNaN(this.f24615a) && f < this.f24615a) {
                return false;
            }
            if (!Float.isNaN(this.f24616b) && f2 < this.f24616b) {
                return false;
            }
            if (Float.isNaN(this.f24617c) || f <= this.f24617c) {
                return Float.isNaN(this.f24618d) || f2 <= this.f24618d;
            }
            return false;
        }
    }

    public g5g(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        m28077b(context, xmlPullParser);
    }

    /* renamed from: a */
    public int m28076a(int i, int i2, float f, float f2) {
        C13625a c13625a = (C13625a) this.f24610d.get(i2);
        if (c13625a == null) {
            return i2;
        }
        if (f == -1.0f || f2 == -1.0f) {
            if (c13625a.f24613c == i) {
                return i;
            }
            Iterator it = c13625a.f24612b.iterator();
            while (it.hasNext()) {
                if (i == ((C13626b) it.next()).f24619e) {
                    return i;
                }
            }
            return c13625a.f24613c;
        }
        Iterator it2 = c13625a.f24612b.iterator();
        C13626b c13626b = null;
        while (it2.hasNext()) {
            C13626b c13626b2 = (C13626b) it2.next();
            if (c13626b2.m28082a(f, f2)) {
                if (i == c13626b2.f24619e) {
                    return i;
                }
                c13626b = c13626b2;
            }
        }
        return c13626b != null ? c13626b.f24619e : c13625a.f24613c;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m28077b(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), mbe.StateSet);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == mbe.StateSet_defaultState) {
                this.f24607a = typedArrayObtainStyledAttributes.getResourceId(index, this.f24607a);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        try {
            int eventType = xmlPullParser.getEventType();
            C13625a c13625a = null;
            while (true) {
                char c = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                c = 2;
                                break;
                            } else {
                                c = 65535;
                                break;
                            }
                        case 1301459538:
                            if (name.equals("LayoutDescription")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c = 3;
                                break;
                            }
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 2) {
                        c13625a = new C13625a(context, xmlPullParser);
                        this.f24610d.put(c13625a.f24611a, c13625a);
                    } else if (c == 3) {
                        C13626b c13626b = new C13626b(context, xmlPullParser);
                        if (c13625a != null) {
                            c13625a.m28080a(c13626b);
                        }
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("StateSet".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    /* renamed from: c */
    public int m28078c(int i, int i2, int i3) {
        return m28079d(-1, i, i2, i3);
    }

    /* renamed from: d */
    public int m28079d(int i, int i2, float f, float f2) {
        int iM28081b;
        if (i == i2) {
            C13625a c13625a = i2 == -1 ? (C13625a) this.f24610d.valueAt(0) : (C13625a) this.f24610d.get(this.f24608b);
            if (c13625a == null) {
                return -1;
            }
            return ((this.f24609c == -1 || !((C13626b) c13625a.f24612b.get(i)).m28082a(f, f2)) && i != (iM28081b = c13625a.m28081b(f, f2))) ? iM28081b == -1 ? c13625a.f24613c : ((C13626b) c13625a.f24612b.get(iM28081b)).f24619e : i;
        }
        C13625a c13625a2 = (C13625a) this.f24610d.get(i2);
        if (c13625a2 == null) {
            return -1;
        }
        int iM28081b2 = c13625a2.m28081b(f, f2);
        return iM28081b2 == -1 ? c13625a2.f24613c : ((C13626b) c13625a2.f24612b.get(iM28081b2)).f24619e;
    }
}

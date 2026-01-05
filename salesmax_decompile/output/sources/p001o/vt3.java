package p001o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.C2005b;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class vt3 {

    /* renamed from: a */
    public final ConstraintLayout f50843a;

    /* renamed from: b */
    public C2005b f50844b;

    /* renamed from: c */
    public int f50845c = -1;

    /* renamed from: d */
    public int f50846d = -1;

    /* renamed from: e */
    public SparseArray f50847e = new SparseArray();

    /* renamed from: f */
    public SparseArray f50848f = new SparseArray();

    /* renamed from: o.vt3$a */
    public static class C17670a {

        /* renamed from: a */
        public int f50849a;

        /* renamed from: b */
        public ArrayList f50850b = new ArrayList();

        /* renamed from: c */
        public int f50851c;

        /* renamed from: d */
        public C2005b f50852d;

        public C17670a(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
            this.f50851c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), mbe.State);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == mbe.State_android_id) {
                    this.f50849a = typedArrayObtainStyledAttributes.getResourceId(index, this.f50849a);
                } else if (index == mbe.State_constraints) {
                    this.f50851c = typedArrayObtainStyledAttributes.getResourceId(index, this.f50851c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f50851c);
                    context.getResources().getResourceName(this.f50851c);
                    if ("layout".equals(resourceTypeName)) {
                        C2005b c2005b = new C2005b();
                        this.f50852d = c2005b;
                        c2005b.m5681n(context, this.f50851c);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public void m53397a(C17671b c17671b) {
            this.f50850b.add(c17671b);
        }

        /* renamed from: b */
        public int m53398b(float f, float f2) {
            for (int i = 0; i < this.f50850b.size(); i++) {
                if (((C17671b) this.f50850b.get(i)).m53399a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: o.vt3$b */
    public static class C17671b {

        /* renamed from: a */
        public float f50853a;

        /* renamed from: b */
        public float f50854b;

        /* renamed from: c */
        public float f50855c;

        /* renamed from: d */
        public float f50856d;

        /* renamed from: e */
        public int f50857e;

        /* renamed from: f */
        public C2005b f50858f;

        public C17671b(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
            this.f50853a = Float.NaN;
            this.f50854b = Float.NaN;
            this.f50855c = Float.NaN;
            this.f50856d = Float.NaN;
            this.f50857e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), mbe.Variant);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == mbe.Variant_constraints) {
                    this.f50857e = typedArrayObtainStyledAttributes.getResourceId(index, this.f50857e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f50857e);
                    context.getResources().getResourceName(this.f50857e);
                    if ("layout".equals(resourceTypeName)) {
                        C2005b c2005b = new C2005b();
                        this.f50858f = c2005b;
                        c2005b.m5681n(context, this.f50857e);
                    }
                } else if (index == mbe.Variant_region_heightLessThan) {
                    this.f50856d = typedArrayObtainStyledAttributes.getDimension(index, this.f50856d);
                } else if (index == mbe.Variant_region_heightMoreThan) {
                    this.f50854b = typedArrayObtainStyledAttributes.getDimension(index, this.f50854b);
                } else if (index == mbe.Variant_region_widthLessThan) {
                    this.f50855c = typedArrayObtainStyledAttributes.getDimension(index, this.f50855c);
                } else if (index == mbe.Variant_region_widthMoreThan) {
                    this.f50853a = typedArrayObtainStyledAttributes.getDimension(index, this.f50853a);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public boolean m53399a(float f, float f2) {
            if (!Float.isNaN(this.f50853a) && f < this.f50853a) {
                return false;
            }
            if (!Float.isNaN(this.f50854b) && f2 < this.f50854b) {
                return false;
            }
            if (Float.isNaN(this.f50855c) || f <= this.f50855c) {
                return Float.isNaN(this.f50856d) || f2 <= this.f50856d;
            }
            return false;
        }
    }

    public vt3(Context context, ConstraintLayout constraintLayout, int i) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
        this.f50843a = constraintLayout;
        m53393a(context, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m53393a(Context context, int i) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            int eventType = xml.getEventType();
            C17670a c17670a = null;
            while (true) {
                char c = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (!name.equals("ConstraintSet")) {
                                c = 65535;
                                break;
                            } else {
                                c = 4;
                                break;
                            }
                        case 80204913:
                            if (name.equals("State")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c = 0;
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
                        C17670a c17670a2 = new C17670a(context, xml);
                        this.f50847e.put(c17670a2.f50849a, c17670a2);
                        c17670a = c17670a2;
                    } else if (c == 3) {
                        C17671b c17671b = new C17671b(context, xml);
                        if (c17670a != null) {
                            c17670a.m53397a(c17671b);
                        }
                    } else if (c == 4) {
                        m53394b(context, xml);
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error parsing resource: ");
            sb.append(i);
        } catch (XmlPullParserException unused2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error parsing resource: ");
            sb2.append(i);
        }
    }

    /* renamed from: b */
    public final void m53394b(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, NumberFormatException, IOException {
        C2005b c2005b = new C2005b();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && OutcomeConstants.OUTCOME_ID.equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), OutcomeConstants.OUTCOME_ID, context.getPackageName()) : -1;
                if (identifier == -1 && attributeValue.length() > 1) {
                    identifier = Integer.parseInt(attributeValue.substring(1));
                }
                c2005b.m5667E(context, xmlPullParser);
                this.f50848f.put(identifier, c2005b);
                return;
            }
        }
    }

    /* renamed from: c */
    public void m53395c(cu3 cu3Var) {
    }

    /* renamed from: d */
    public void m53396d(int i, float f, float f2) {
        int iM53398b;
        int i2 = this.f50845c;
        if (i2 == i) {
            C17670a c17670a = i == -1 ? (C17670a) this.f50847e.valueAt(0) : (C17670a) this.f50847e.get(i2);
            int i3 = this.f50846d;
            if ((i3 == -1 || !((C17671b) c17670a.f50850b.get(i3)).m53399a(f, f2)) && this.f50846d != (iM53398b = c17670a.m53398b(f, f2))) {
                C2005b c2005b = iM53398b == -1 ? this.f50844b : ((C17671b) c17670a.f50850b.get(iM53398b)).f50858f;
                if (iM53398b != -1) {
                    int i4 = ((C17671b) c17670a.f50850b.get(iM53398b)).f50857e;
                }
                if (c2005b == null) {
                    return;
                }
                this.f50846d = iM53398b;
                c2005b.m5677i(this.f50843a);
                return;
            }
            return;
        }
        this.f50845c = i;
        C17670a c17670a2 = (C17670a) this.f50847e.get(i);
        int iM53398b2 = c17670a2.m53398b(f, f2);
        C2005b c2005b2 = iM53398b2 == -1 ? c17670a2.f50852d : ((C17671b) c17670a2.f50850b.get(iM53398b2)).f50858f;
        if (iM53398b2 != -1) {
            int i5 = ((C17671b) c17670a2.f50850b.get(iM53398b2)).f50857e;
        }
        if (c2005b2 != null) {
            this.f50846d = iM53398b2;
            c2005b2.m5677i(this.f50843a);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("NO Constraint set found ! id=");
        sb.append(i);
        sb.append(", dim =");
        sb.append(f);
        sb.append(", ");
        sb.append(f2);
    }
}

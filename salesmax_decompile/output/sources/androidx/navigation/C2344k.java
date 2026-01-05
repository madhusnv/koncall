package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.navigation.C2331b;
import androidx.navigation.C2335f;
import androidx.navigation.C2345l;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import p001o.e9g;
import p001o.id5;
import p001o.sae;
import p001o.sq8;
import p001o.tae;
import p001o.vrb;
import p001o.y3i;

/* renamed from: androidx.navigation.k */
/* loaded from: classes2.dex */
public final class C2344k {

    /* renamed from: c */
    public static final a f9636c = new a(null);

    /* renamed from: d */
    public static final ThreadLocal f9637d = new ThreadLocal();

    /* renamed from: a */
    public final Context f9638a;

    /* renamed from: b */
    public final C2349p f9639b;

    /* renamed from: androidx.navigation.k$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final AbstractC2347n m8800a(TypedValue typedValue, AbstractC2347n abstractC2347n, AbstractC2347n abstractC2347n2, String str, String str2) throws XmlPullParserException {
            sq8.m48649h(typedValue, "value");
            sq8.m48649h(abstractC2347n2, "expectedNavType");
            sq8.m48649h(str2, "foundType");
            if (abstractC2347n == null || abstractC2347n == abstractC2347n2) {
                return abstractC2347n == null ? abstractC2347n2 : abstractC2347n;
            }
            throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
        }
    }

    public C2344k(Context context, C2349p c2349p) {
        sq8.m48649h(context, "context");
        sq8.m48649h(c2349p, "navigatorProvider");
        this.f9638a = context;
        this.f9639b = c2349p;
    }

    /* renamed from: a */
    public final AbstractC2341h m8793a(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i) throws XmlPullParserException, IOException {
        int depth;
        C2349p c2349p = this.f9639b;
        String name = xmlResourceParser.getName();
        sq8.m48648g(name, "parser.name");
        AbstractC2341h abstractC2341hMo8527a = c2349p.m8956d(name).mo8527a();
        abstractC2341hMo8527a.mo8532O(this.f9638a, attributeSet);
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name2 = xmlResourceParser.getName();
                if (sq8.m48644c("argument", name2)) {
                    m8798f(resources, abstractC2341hMo8527a, attributeSet, i);
                } else if (sq8.m48644c("deepLink", name2)) {
                    m8799g(resources, abstractC2341hMo8527a, attributeSet);
                } else if (sq8.m48644c("action", name2)) {
                    m8795c(resources, abstractC2341hMo8527a, attributeSet, xmlResourceParser, i);
                } else if (sq8.m48644c("include", name2) && (abstractC2341hMo8527a instanceof C2342i)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, sae.NavInclude);
                    sq8.m48648g(typedArrayObtainAttributes, "res.obtainAttributes(att…n.R.styleable.NavInclude)");
                    ((C2342i) abstractC2341hMo8527a).m8783V(m8794b(typedArrayObtainAttributes.getResourceId(sae.NavInclude_graph, 0)));
                    y3i y3iVar = y3i.f54824a;
                    typedArrayObtainAttributes.recycle();
                } else if (abstractC2341hMo8527a instanceof C2342i) {
                    ((C2342i) abstractC2341hMo8527a).m8783V(m8793a(resources, xmlResourceParser, attributeSet, i));
                }
            }
        }
        return abstractC2341hMo8527a;
    }

    /* renamed from: b */
    public final C2342i m8794b(int i) throws Resources.NotFoundException {
        int next;
        Resources resources = this.f9638a.getResources();
        XmlResourceParser xml = resources.getXml(i);
        sq8.m48648g(xml, "res.getXml(graphResId)");
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i) + " line " + xml.getLineNumber(), e);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        sq8.m48648g(resources, "res");
        sq8.m48648g(attributeSetAsAttributeSet, "attrs");
        AbstractC2341h abstractC2341hM8793a = m8793a(resources, xml, attributeSetAsAttributeSet, i);
        if (abstractC2341hM8793a instanceof C2342i) {
            return (C2342i) abstractC2341hM8793a;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }

    /* renamed from: c */
    public final void m8795c(Resources resources, AbstractC2341h abstractC2341h, AttributeSet attributeSet, XmlResourceParser xmlResourceParser, int i) throws XmlPullParserException, IOException {
        int depth;
        Context context = this.f9638a;
        int[] iArr = tae.NavAction;
        sq8.m48648g(iArr, "NavAction");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(tae.NavAction_android_id, 0);
        vrb vrbVar = new vrb(typedArrayObtainStyledAttributes.getResourceId(tae.NavAction_destination, 0), null, null, 6, null);
        C2345l.a aVar = new C2345l.a();
        aVar.m8817d(typedArrayObtainStyledAttributes.getBoolean(tae.NavAction_launchSingleTop, false));
        aVar.m8824l(typedArrayObtainStyledAttributes.getBoolean(tae.NavAction_restoreState, false));
        aVar.m8820g(typedArrayObtainStyledAttributes.getResourceId(tae.NavAction_popUpTo, -1), typedArrayObtainStyledAttributes.getBoolean(tae.NavAction_popUpToInclusive, false), typedArrayObtainStyledAttributes.getBoolean(tae.NavAction_popUpToSaveState, false));
        aVar.m8815b(typedArrayObtainStyledAttributes.getResourceId(tae.NavAction_enterAnim, -1));
        aVar.m8816c(typedArrayObtainStyledAttributes.getResourceId(tae.NavAction_exitAnim, -1));
        aVar.m8818e(typedArrayObtainStyledAttributes.getResourceId(tae.NavAction_popEnterAnim, -1));
        aVar.m8819f(typedArrayObtainStyledAttributes.getResourceId(tae.NavAction_popExitAnim, -1));
        vrbVar.m53349e(aVar.m8814a());
        Bundle bundle = new Bundle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && sq8.m48644c("argument", xmlResourceParser.getName())) {
                m8797e(resources, bundle, attributeSet, i);
            }
        }
        if (!bundle.isEmpty()) {
            vrbVar.m53348d(bundle);
        }
        abstractC2341h.m8762P(resourceId, vrbVar);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    public final C2331b m8796d(TypedArray typedArray, Resources resources, int i) throws XmlPullParserException {
        C2331b.a aVar = new C2331b.a();
        int i2 = 0;
        aVar.m8547c(typedArray.getBoolean(tae.NavArgument_nullable, false));
        ThreadLocal threadLocal = f9637d;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(tae.NavArgument_argType);
        Object objMo8937l = null;
        AbstractC2347n abstractC2347nM8933a = string != null ? AbstractC2347n.f9673c.m8933a(string, resources.getResourcePackageName(i)) : null;
        if (typedArray.getValue(tae.NavArgument_android_defaultValue, typedValue)) {
            AbstractC2347n abstractC2347n = AbstractC2347n.f9675e;
            if (abstractC2347nM8933a == abstractC2347n) {
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    i2 = i3;
                } else if (typedValue.type != 16 || typedValue.data != 0) {
                    throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + abstractC2347nM8933a.mo8833b() + ". Must be a reference to a resource.");
                }
                objMo8937l = Integer.valueOf(i2);
            } else {
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    if (abstractC2347nM8933a != null) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + abstractC2347nM8933a.mo8833b() + ". You must use a \"" + abstractC2347n.mo8833b() + "\" type to reference other resources.");
                    }
                    objMo8937l = Integer.valueOf(i4);
                    abstractC2347nM8933a = abstractC2347n;
                } else if (abstractC2347nM8933a == AbstractC2347n.f9687q) {
                    objMo8937l = typedArray.getString(tae.NavArgument_android_defaultValue);
                } else {
                    int i5 = typedValue.type;
                    if (i5 == 3) {
                        String string2 = typedValue.string.toString();
                        if (abstractC2347nM8933a == null) {
                            abstractC2347nM8933a = AbstractC2347n.f9673c.m8934b(string2);
                        }
                        objMo8937l = abstractC2347nM8933a.mo8937l(string2);
                    } else if (i5 == 4) {
                        abstractC2347nM8933a = f9636c.m8800a(typedValue, abstractC2347nM8933a, AbstractC2347n.f9681k, string, "float");
                        objMo8937l = Float.valueOf(typedValue.getFloat());
                    } else if (i5 == 5) {
                        abstractC2347nM8933a = f9636c.m8800a(typedValue, abstractC2347nM8933a, AbstractC2347n.f9674d, string, "dimension");
                        objMo8937l = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                    } else if (i5 == 18) {
                        abstractC2347nM8933a = f9636c.m8800a(typedValue, abstractC2347nM8933a, AbstractC2347n.f9684n, string, "boolean");
                        objMo8937l = Boolean.valueOf(typedValue.data != 0);
                    } else {
                        if (i5 < 16 || i5 > 31) {
                            throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                        }
                        AbstractC2347n abstractC2347n2 = AbstractC2347n.f9681k;
                        if (abstractC2347nM8933a == abstractC2347n2) {
                            abstractC2347nM8933a = f9636c.m8800a(typedValue, abstractC2347nM8933a, abstractC2347n2, string, "float");
                            objMo8937l = Float.valueOf(typedValue.data);
                        } else {
                            abstractC2347nM8933a = f9636c.m8800a(typedValue, abstractC2347nM8933a, AbstractC2347n.f9674d, string, "integer");
                            objMo8937l = Integer.valueOf(typedValue.data);
                        }
                    }
                }
            }
        }
        if (objMo8937l != null) {
            aVar.m8546b(objMo8937l);
        }
        if (abstractC2347nM8933a != null) {
            aVar.m8548d(abstractC2347nM8933a);
        }
        return aVar.m8545a();
    }

    /* renamed from: e */
    public final void m8797e(Resources resources, Bundle bundle, AttributeSet attributeSet, int i) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, tae.NavArgument);
        sq8.m48648g(typedArrayObtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String string = typedArrayObtainAttributes.getString(tae.NavArgument_android_name);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        sq8.m48648g(string, "array.getString(R.stylea…uments must have a name\")");
        C2331b c2331bM8796d = m8796d(typedArrayObtainAttributes, resources, i);
        if (c2331bM8796d.m8540b()) {
            c2331bM8796d.m8543e(string, bundle);
        }
        y3i y3iVar = y3i.f54824a;
        typedArrayObtainAttributes.recycle();
    }

    /* renamed from: f */
    public final void m8798f(Resources resources, AbstractC2341h abstractC2341h, AttributeSet attributeSet, int i) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, tae.NavArgument);
        sq8.m48648g(typedArrayObtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String string = typedArrayObtainAttributes.getString(tae.NavArgument_android_name);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        sq8.m48648g(string, "array.getString(R.stylea…uments must have a name\")");
        abstractC2341h.m8766e(string, m8796d(typedArrayObtainAttributes, resources, i));
        y3i y3iVar = y3i.f54824a;
        typedArrayObtainAttributes.recycle();
    }

    /* renamed from: g */
    public final void m8799g(Resources resources, AbstractC2341h abstractC2341h, AttributeSet attributeSet) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, tae.NavDeepLink);
        sq8.m48648g(typedArrayObtainAttributes, "res.obtainAttributes(att… R.styleable.NavDeepLink)");
        String string = typedArrayObtainAttributes.getString(tae.NavDeepLink_uri);
        String string2 = typedArrayObtainAttributes.getString(tae.NavDeepLink_action);
        String string3 = typedArrayObtainAttributes.getString(tae.NavDeepLink_mimeType);
        if (string == null || string.length() == 0) {
            if (string2 == null || string2.length() == 0) {
                if (string3 == null || string3.length() == 0) {
                    throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
                }
            }
        }
        C2335f.a aVar = new C2335f.a();
        if (string != null) {
            String packageName = this.f9638a.getPackageName();
            sq8.m48648g(packageName, "context.packageName");
            aVar.m8686d(e9g.m24593G(string, "${applicationId}", packageName, false, 4, null));
        }
        if (!(string2 == null || string2.length() == 0)) {
            String packageName2 = this.f9638a.getPackageName();
            sq8.m48648g(packageName2, "context.packageName");
            aVar.m8684b(e9g.m24593G(string2, "${applicationId}", packageName2, false, 4, null));
        }
        if (string3 != null) {
            String packageName3 = this.f9638a.getPackageName();
            sq8.m48648g(packageName3, "context.packageName");
            aVar.m8685c(e9g.m24593G(string3, "${applicationId}", packageName3, false, 4, null));
        }
        abstractC2341h.m8767j(aVar.m8683a());
        y3i y3iVar = y3i.f54824a;
        typedArrayObtainAttributes.recycle();
    }
}

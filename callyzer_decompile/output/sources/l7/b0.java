package l7;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import kotlin.jvm.internal.AbstractC4154l;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: c */
    public static final ThreadLocal f22005c = new ThreadLocal();

    /* renamed from: a */
    public final Context f22006a;

    /* renamed from: b */
    public final o0 f22007b;

    public b0(Context context, o0 navigatorProvider) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(navigatorProvider, "navigatorProvider");
        this.f22006a = context;
        this.f22007b = navigatorProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0190  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l7.C4408h m9196c(android.content.res.TypedArray r12, android.content.res.Resources r13, int r14) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.b0.m9196c(android.content.res.TypedArray, android.content.res.Resources, int):l7.h");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0103, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0223, code lost:
    
        return r4;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l7.AbstractC4422v m9197a(android.content.res.Resources r28, android.content.res.XmlResourceParser r29, android.util.AttributeSet r30, int r31) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.b0.m9197a(android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, int):l7.v");
    }

    /* renamed from: b */
    public final C4423w m9198b(int i10) throws Resources.NotFoundException {
        int next;
        Resources resources = this.f22006a.getResources();
        XmlResourceParser xml = resources.getXml(i10);
        AbstractC4154l.m8922e(xml, "getXml(...)");
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e2) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i10) + " line " + xml.getLineNumber(), e2);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        AbstractC4154l.m8920c(attributeSetAsAttributeSet);
        AbstractC4422v abstractC4422vM9197a = m9197a(resources, xml, attributeSetAsAttributeSet, i10);
        if (abstractC4422vM9197a instanceof C4423w) {
            return (C4423w) abstractC4422vM9197a;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }
}

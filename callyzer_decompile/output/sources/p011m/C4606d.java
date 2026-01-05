package p011m;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p009j.AbstractC3500a;
import p012n.MenuC4929i;
import p013o.r0;
import pg.s8;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m.d */
/* loaded from: classes.dex */
public final class C4606d extends MenuInflater {

    /* renamed from: e */
    public static final Class[] f22808e;

    /* renamed from: f */
    public static final Class[] f22809f;

    /* renamed from: a */
    public final Object[] f22810a;

    /* renamed from: b */
    public final Object[] f22811b;

    /* renamed from: c */
    public final Context f22812c;

    /* renamed from: d */
    public Object f22813d;

    static {
        Class[] clsArr = {Context.class};
        f22808e = clsArr;
        f22809f = clsArr;
    }

    public C4606d(Context context) {
        super(context);
        this.f22812c = context;
        Object[] objArr = {context};
        this.f22810a = objArr;
        this.f22811b = objArr;
    }

    /* renamed from: a */
    public static Object m9479a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m9479a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* renamed from: b */
    public final void m9480b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i10;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        C4605c c4605c = new C4605c(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i10 = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z6 = false;
        boolean z10 = false;
        String str = null;
        while (!z6) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i10) {
                if (eventType != 3) {
                    xmlPullParser2 = xmlPullParser;
                    z6 = z6;
                } else {
                    String name2 = xmlPullParser.getName();
                    if (z10 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z10 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            c4605c.f22783b = 0;
                            c4605c.f22784c = 0;
                            c4605c.f22785d = 0;
                            c4605c.f22786e = 0;
                            c4605c.f22787f = true;
                            c4605c.f22788g = true;
                        } else if (name2.equals("item")) {
                            if (!c4605c.f22789h) {
                                c4605c.f22789h = true;
                                c4605c.m9478b(c4605c.f22782a.add(c4605c.f22783b, c4605c.f22790i, c4605c.f22791j, c4605c.f22792k));
                            }
                        } else if (name2.equals("menu")) {
                            xmlPullParser2 = xmlPullParser;
                            z6 = true;
                        }
                        xmlPullParser2 = xmlPullParser;
                        z6 = z6;
                    }
                }
                eventType = xmlPullParser2.next();
                i10 = 2;
                z6 = z6;
                z10 = z10;
            } else {
                if (!z10) {
                    String name3 = xmlPullParser.getName();
                    boolean zEquals = name3.equals("group");
                    Context context = this.f22812c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3500a.f18357n);
                        c4605c.f22783b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        c4605c.f22784c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        c4605c.f22785d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        c4605c.f22786e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        c4605c.f22787f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        c4605c.f22788g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC3500a.f18358o);
                            c4605c.f22790i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                            c4605c.f22791j = (typedArrayObtainStyledAttributes2.getInt(5, c4605c.f22784c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, c4605c.f22785d) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
                            c4605c.f22792k = typedArrayObtainStyledAttributes2.getText(7);
                            c4605c.f22793l = typedArrayObtainStyledAttributes2.getText(8);
                            c4605c.f22794m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                            String string = typedArrayObtainStyledAttributes2.getString(9);
                            c4605c.f22795n = string == null ? (char) 0 : string.charAt(0);
                            c4605c.f22796o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                            String string2 = typedArrayObtainStyledAttributes2.getString(10);
                            c4605c.f22797p = string2 == null ? (char) 0 : string2.charAt(0);
                            c4605c.f22798q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                            if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                                c4605c.f22799r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                c4605c.f22799r = c4605c.f22786e;
                            }
                            c4605c.f22800s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                            c4605c.f22801t = typedArrayObtainStyledAttributes2.getBoolean(4, c4605c.f22787f);
                            c4605c.f22802u = typedArrayObtainStyledAttributes2.getBoolean(1, c4605c.f22788g);
                            c4605c.f22803v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                            c4605c.f22806y = typedArrayObtainStyledAttributes2.getString(12);
                            c4605c.f22804w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                            c4605c.f22805x = typedArrayObtainStyledAttributes2.getString(15);
                            String string3 = typedArrayObtainStyledAttributes2.getString(14);
                            if (string3 != null && c4605c.f22804w == 0 && c4605c.f22805x == null && c4605c.m9477a(string3, f22809f, this.f22811b) != null) {
                                throw new ClassCastException();
                            }
                            c4605c.f22807z = typedArrayObtainStyledAttributes2.getText(17);
                            c4605c.f22778A = typedArrayObtainStyledAttributes2.getText(22);
                            if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                                c4605c.f22780C = r0.m10287b(typedArrayObtainStyledAttributes2.getInt(19, -1), c4605c.f22780C);
                            } else {
                                c4605c.f22780C = null;
                            }
                            if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                                if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = s8.m11863a(context, resourceId)) == null) {
                                    colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                                }
                                c4605c.f22779B = colorStateList;
                            } else {
                                c4605c.f22779B = null;
                            }
                            typedArrayObtainStyledAttributes2.recycle();
                            c4605c.f22789h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            c4605c.f22789h = true;
                            SubMenu subMenuAddSubMenu = c4605c.f22782a.addSubMenu(c4605c.f22783b, c4605c.f22790i, c4605c.f22791j, c4605c.f22792k);
                            c4605c.m9478b(subMenuAddSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            m9480b(xmlPullParser2, attributeSet, subMenuAddSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z10 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i10 = 2;
                        z6 = z6;
                        z10 = z10;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z6 = z6;
            }
            eventType = xmlPullParser2.next();
            i10 = 2;
            z6 = z6;
            z10 = z10;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i10, Menu menu) {
        if (!(menu instanceof MenuC4929i)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z6 = false;
        try {
            try {
                layout = this.f22812c.getResources().getLayout(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof MenuC4929i) {
                    MenuC4929i menuC4929i = (MenuC4929i) menu;
                    if (!menuC4929i.f24545m) {
                        menuC4929i.m9870s();
                        z6 = true;
                    }
                }
                m9480b(layout, attributeSetAsAttributeSet, menu);
                if (z6) {
                    ((MenuC4929i) menu).m9869r();
                }
                layout.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            }
        } catch (Throwable th2) {
            if (z6) {
                ((MenuC4929i) menu).m9869r();
            }
            if (layout != null) {
                layout.close();
            }
            throw th2;
        }
    }
}

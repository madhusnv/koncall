package p001o;

import android.content.Context;
import android.util.Xml;
import androidx.constraintlayout.widget.C2004a;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class sc9 {

    /* renamed from: b */
    public static HashMap f45211b;

    /* renamed from: a */
    public HashMap f45212a = new HashMap();

    static {
        HashMap map = new HashMap();
        f45211b = map;
        try {
            map.put("KeyAttribute", jc9.class.getConstructor(new Class[0]));
            f45211b.put("KeyPosition", ed9.class.getConstructor(new Class[0]));
            f45211b.put("KeyCycle", lc9.class.getConstructor(new Class[0]));
            f45211b.put("KeyTimeCycle", jd9.class.getConstructor(new Class[0]));
            f45211b.put("KeyTrigger", kd9.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException unused) {
        }
    }

    public sc9() {
    }

    /* renamed from: a */
    public void m48185a(gmb gmbVar) {
        ArrayList arrayList = (ArrayList) this.f45212a.get(-1);
        if (arrayList != null) {
            gmbVar.m29065b(arrayList);
        }
    }

    /* renamed from: b */
    public void m48186b(gmb gmbVar) {
        ArrayList arrayList = (ArrayList) this.f45212a.get(Integer.valueOf(gmbVar.f25478c));
        if (arrayList != null) {
            gmbVar.m29065b(arrayList);
        }
        ArrayList arrayList2 = (ArrayList) this.f45212a.get(-1);
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                hc9 hc9Var = (hc9) it.next();
                if (hc9Var.m30223f(((ConstraintLayout.LayoutParams) gmbVar.f25477b.getLayoutParams()).c0)) {
                    gmbVar.m29064a(hc9Var);
                }
            }
        }
    }

    /* renamed from: c */
    public void m48187c(hc9 hc9Var) {
        if (!this.f45212a.containsKey(Integer.valueOf(hc9Var.f26656b))) {
            this.f45212a.put(Integer.valueOf(hc9Var.f26656b), new ArrayList());
        }
        ArrayList arrayList = (ArrayList) this.f45212a.get(Integer.valueOf(hc9Var.f26656b));
        if (arrayList != null) {
            arrayList.add(hc9Var);
        }
    }

    /* renamed from: d */
    public ArrayList m48188d(int i) {
        return (ArrayList) this.f45212a.get(Integer.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sc9(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        HashMap map;
        HashMap map2;
        char c;
        hc9 jc9Var;
        try {
            int eventType = xmlPullParser.getEventType();
            hc9 hc9Var = null;
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3 && "KeyFrameSet".equals(xmlPullParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlPullParser.getName();
                    if (f45211b.containsKey(name)) {
                        switch (name.hashCode()) {
                            case -300573030:
                                if (!name.equals("KeyTimeCycle")) {
                                    c = 65535;
                                    break;
                                } else {
                                    c = 3;
                                    break;
                                }
                            case -298435811:
                                if (name.equals("KeyAttribute")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 540053991:
                                if (name.equals("KeyCycle")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case 1153397896:
                                if (name.equals("KeyPosition")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 1308496505:
                                if (name.equals("KeyTrigger")) {
                                    c = 4;
                                    break;
                                }
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        if (c == 0) {
                            jc9Var = new jc9();
                        } else if (c == 1) {
                            jc9Var = new ed9();
                        } else if (c == 2) {
                            jc9Var = new lc9();
                        } else if (c == 3) {
                            jc9Var = new jd9();
                        } else if (c == 4) {
                            jc9Var = new kd9();
                        } else {
                            throw new NullPointerException("Key " + name + " not found");
                        }
                        jc9Var.mo24790e(context, Xml.asAttributeSet(xmlPullParser));
                        m48187c(jc9Var);
                        hc9Var = jc9Var;
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (hc9Var != null && (map2 = hc9Var.f26659e) != null) {
                            C2004a.m5637i(context, xmlPullParser, map2);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && hc9Var != null && (map = hc9Var.f26659e) != null) {
                        C2004a.m5637i(context, xmlPullParser, map);
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }
}

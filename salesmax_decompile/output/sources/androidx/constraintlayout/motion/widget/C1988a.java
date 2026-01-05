package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C2005b;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p001o.g5g;
import p001o.gmb;
import p001o.k75;
import p001o.mbe;
import p001o.q26;
import p001o.sc9;
import p001o.t8e;

/* renamed from: androidx.constraintlayout.motion.widget.a */
/* loaded from: classes2.dex */
public class C1988a {

    /* renamed from: a */
    public final MotionLayout f6640a;

    /* renamed from: m */
    public MotionEvent f6652m;

    /* renamed from: p */
    public MotionLayout.InterfaceC1983f f6655p;

    /* renamed from: q */
    public boolean f6656q;

    /* renamed from: r */
    public final C1991d f6657r;

    /* renamed from: s */
    public float f6658s;

    /* renamed from: t */
    public float f6659t;

    /* renamed from: b */
    public g5g f6641b = null;

    /* renamed from: c */
    public b f6642c = null;

    /* renamed from: d */
    public boolean f6643d = false;

    /* renamed from: e */
    public ArrayList f6644e = new ArrayList();

    /* renamed from: f */
    public b f6645f = null;

    /* renamed from: g */
    public ArrayList f6646g = new ArrayList();

    /* renamed from: h */
    public SparseArray f6647h = new SparseArray();

    /* renamed from: i */
    public HashMap f6648i = new HashMap();

    /* renamed from: j */
    public SparseIntArray f6649j = new SparseIntArray();

    /* renamed from: k */
    public int f6650k = 400;

    /* renamed from: l */
    public int f6651l = 0;

    /* renamed from: n */
    public boolean f6653n = false;

    /* renamed from: o */
    public boolean f6654o = false;

    /* renamed from: androidx.constraintlayout.motion.widget.a$a */
    public class a implements Interpolator {

        /* renamed from: a */
        public final /* synthetic */ q26 f6660a;

        public a(q26 q26Var) {
            this.f6660a = q26Var;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (float) this.f6660a.mo20345a(f);
        }
    }

    public C1988a(Context context, MotionLayout motionLayout, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        this.f6640a = motionLayout;
        this.f6657r = new C1991d(motionLayout);
        m5428K(context, i);
        this.f6647h.put(t8e.motion_base, new C2005b());
        this.f6648i.put("motion_base", Integer.valueOf(t8e.motion_base));
    }

    public static String a0(String str) {
        if (str == null) {
            return "";
        }
        int iIndexOf = str.indexOf(47);
        return iIndexOf < 0 ? str : str.substring(iIndexOf + 1);
    }

    /* renamed from: A */
    public float m5418A() {
        b bVar = this.f6642c;
        if (bVar == null || bVar.f6673l == null) {
            return 0.0f;
        }
        return this.f6642c.f6673l.m5514l();
    }

    /* renamed from: B */
    public float m5419B() {
        b bVar = this.f6642c;
        if (bVar == null || bVar.f6673l == null) {
            return 0.0f;
        }
        return this.f6642c.f6673l.m5515m();
    }

    /* renamed from: C */
    public float m5420C() {
        b bVar = this.f6642c;
        if (bVar == null || bVar.f6673l == null) {
            return 0.0f;
        }
        return this.f6642c.f6673l.m5516n();
    }

    /* renamed from: D */
    public float m5421D() {
        b bVar = this.f6642c;
        if (bVar == null || bVar.f6673l == null) {
            return 0.0f;
        }
        return this.f6642c.f6673l.m5517o();
    }

    /* renamed from: E */
    public float m5422E() {
        b bVar = this.f6642c;
        if (bVar != null) {
            return bVar.f6670i;
        }
        return 0.0f;
    }

    /* renamed from: F */
    public int m5423F() {
        b bVar = this.f6642c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f6665d;
    }

    /* renamed from: G */
    public b m5424G(int i) {
        Iterator it = this.f6644e.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f6662a == i) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: H */
    public List m5425H(int i) {
        int iM5463y = m5463y(i);
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f6644e.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f6665d == iM5463y || bVar.f6664c == iM5463y) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* renamed from: I */
    public final boolean m5426I(int i) {
        int i2 = this.f6649j.get(i);
        int size = this.f6649j.size();
        while (i2 > 0) {
            if (i2 == i) {
                return true;
            }
            int i3 = size - 1;
            if (size < 0) {
                return true;
            }
            i2 = this.f6649j.get(i2);
            size = i3;
        }
        return false;
    }

    /* renamed from: J */
    public final boolean m5427J() {
        return this.f6655p != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008a  */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5428K(Context context, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            int eventType = xml.getEventType();
            b bVar = null;
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
                                c = 5;
                                break;
                            }
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                c = '\b';
                                break;
                            }
                            break;
                        case -687739768:
                            if (name.equals("Include")) {
                                c = 7;
                                break;
                            }
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                c = '\t';
                                break;
                            }
                            break;
                        case 269306229:
                            if (name.equals("Transition")) {
                                break;
                            }
                            break;
                        case 312750793:
                            if (name.equals("OnClick")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 327855227:
                            if (name.equals("OnSwipe")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 793277014:
                            if (name.equals("MotionScene")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 1942574248:
                            if (name.equals("include")) {
                                c = 6;
                                break;
                            }
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            m5432O(context, xml);
                            break;
                        case 1:
                            ArrayList arrayList = this.f6644e;
                            bVar = new b(this, context, xml);
                            arrayList.add(bVar);
                            if (this.f6642c == null && !bVar.f6663b) {
                                this.f6642c = bVar;
                                if (bVar.f6673l != null) {
                                    this.f6642c.f6673l.m5526x(this.f6656q);
                                }
                            }
                            if (!bVar.f6663b) {
                                break;
                            } else {
                                if (bVar.f6664c == -1) {
                                    this.f6645f = bVar;
                                } else {
                                    this.f6646g.add(bVar);
                                }
                                this.f6644e.remove(bVar);
                                break;
                            }
                        case 2:
                            if (bVar == null) {
                                String resourceEntryName = context.getResources().getResourceEntryName(i);
                                int lineNumber = xml.getLineNumber();
                                StringBuilder sb = new StringBuilder();
                                sb.append(" OnSwipe (");
                                sb.append(resourceEntryName);
                                sb.append(".xml:");
                                sb.append(lineNumber);
                                sb.append(")");
                            }
                            if (bVar == null) {
                                break;
                            } else {
                                bVar.f6673l = new C1989b(context, this.f6640a, xml);
                                break;
                            }
                        case 3:
                            if (bVar != null && !this.f6640a.isInEditMode()) {
                                bVar.m5493u(context, xml);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case 4:
                            this.f6641b = new g5g(context, xml);
                            break;
                        case 5:
                            m5429L(context, xml);
                            break;
                        case 6:
                        case 7:
                            m5431N(context, xml);
                            break;
                        case '\b':
                            sc9 sc9Var = new sc9(context, xml);
                            if (bVar == null) {
                                break;
                            } else {
                                bVar.f6672k.add(sc9Var);
                                break;
                            }
                        case '\t':
                            this.f6657r.m5549a(new C1990c(context, xml));
                            break;
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error parsing resource: ");
            sb2.append(i);
        } catch (XmlPullParserException unused2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Error parsing resource: ");
            sb3.append(i);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m5429L(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String attributeValue;
        C2005b c2005b = new C2005b();
        c2005b.m5671R(false);
        int attributeCount = xmlPullParser.getAttributeCount();
        int iM5456r = -1;
        int iM5456r2 = -1;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            attributeValue = xmlPullParser.getAttributeValue(i);
            attributeName.hashCode();
            switch (attributeName) {
                case "deriveConstraintsFrom":
                    iM5456r2 = m5456r(context, attributeValue);
                    break;
                case "constraintRotate":
                    try {
                        c2005b.f6963e = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.hashCode();
                        switch (attributeValue) {
                            case "x_left":
                                c2005b.f6963e = 4;
                                break;
                            case "left":
                                c2005b.f6963e = 2;
                                break;
                            case "none":
                                c2005b.f6963e = 0;
                                break;
                            case "right":
                                c2005b.f6963e = 1;
                                break;
                            case "x_right":
                                c2005b.f6963e = 3;
                                break;
                        }
                    }
                case "id":
                    iM5456r = m5456r(context, attributeValue);
                    this.f6648i.put(a0(attributeValue), Integer.valueOf(iM5456r));
                    c2005b.f6960b = k75.m35104c(context, iM5456r);
                    break;
                case "stateLabels":
                    c2005b.m5672S(attributeValue);
                    break;
            }
        }
        if (iM5456r != -1) {
            if (this.f6640a.N0 != 0) {
                c2005b.m5673T(true);
            }
            c2005b.m5667E(context, xmlPullParser);
            if (iM5456r2 != -1) {
                this.f6649j.put(iM5456r, iM5456r2);
            }
            this.f6647h.put(iM5456r, c2005b);
        }
        return iM5456r;
    }

    /* renamed from: M */
    public final int m5430M(Context context, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return m5429L(context, xml);
                }
            }
            return -1;
        } catch (IOException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error parsing resource: ");
            sb.append(i);
            return -1;
        } catch (XmlPullParserException unused2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error parsing resource: ");
            sb2.append(i);
            return -1;
        }
    }

    /* renamed from: N */
    public final void m5431N(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, Resources.NotFoundException, IOException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), mbe.include);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == mbe.include_constraintSet) {
                m5430M(context, typedArrayObtainStyledAttributes.getResourceId(index, -1));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: O */
    public final void m5432O(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), mbe.MotionScene);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == mbe.MotionScene_defaultDuration) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f6650k);
                this.f6650k = i2;
                if (i2 < 8) {
                    this.f6650k = 8;
                }
            } else if (index == mbe.MotionScene_layoutDuringTransition) {
                this.f6651l = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: P */
    public void m5433P(float f, float f2) {
        b bVar = this.f6642c;
        if (bVar == null || bVar.f6673l == null) {
            return;
        }
        this.f6642c.f6673l.m5523u(f, f2);
    }

    /* renamed from: Q */
    public void m5434Q(float f, float f2) {
        b bVar = this.f6642c;
        if (bVar == null || bVar.f6673l == null) {
            return;
        }
        this.f6642c.f6673l.m5524v(f, f2);
    }

    /* renamed from: R */
    public void m5435R(MotionEvent motionEvent, int i, MotionLayout motionLayout) {
        MotionLayout.InterfaceC1983f interfaceC1983f;
        MotionEvent motionEvent2;
        RectF rectF = new RectF();
        if (this.f6655p == null) {
            this.f6655p = this.f6640a.v0();
        }
        this.f6655p.mo5400c(motionEvent);
        if (i != -1) {
            int action = motionEvent.getAction();
            boolean z = false;
            if (action == 0) {
                this.f6658s = motionEvent.getRawX();
                this.f6659t = motionEvent.getRawY();
                this.f6652m = motionEvent;
                this.f6653n = false;
                if (this.f6642c.f6673l != null) {
                    RectF rectFM5508f = this.f6642c.f6673l.m5508f(this.f6640a, rectF);
                    if (rectFM5508f != null && !rectFM5508f.contains(this.f6652m.getX(), this.f6652m.getY())) {
                        this.f6652m = null;
                        this.f6653n = true;
                        return;
                    }
                    RectF rectFM5518p = this.f6642c.f6673l.m5518p(this.f6640a, rectF);
                    if (rectFM5518p == null || rectFM5518p.contains(this.f6652m.getX(), this.f6652m.getY())) {
                        this.f6654o = false;
                    } else {
                        this.f6654o = true;
                    }
                    this.f6642c.f6673l.m5525w(this.f6658s, this.f6659t);
                    return;
                }
                return;
            }
            if (action == 2 && !this.f6653n) {
                float rawY = motionEvent.getRawY() - this.f6659t;
                float rawX = motionEvent.getRawX() - this.f6658s;
                if ((rawX == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && rawY == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) || (motionEvent2 = this.f6652m) == null) {
                    return;
                }
                b bVarM5447i = m5447i(i, rawX, rawY, motionEvent2);
                if (bVarM5447i != null) {
                    motionLayout.setTransition(bVarM5447i);
                    RectF rectFM5518p2 = this.f6642c.f6673l.m5518p(this.f6640a, rectF);
                    if (rectFM5518p2 != null && !rectFM5518p2.contains(this.f6652m.getX(), this.f6652m.getY())) {
                        z = true;
                    }
                    this.f6654o = z;
                    this.f6642c.f6673l.m5528z(this.f6658s, this.f6659t);
                }
            }
        }
        if (this.f6653n) {
            return;
        }
        b bVar = this.f6642c;
        if (bVar != null && bVar.f6673l != null && !this.f6654o) {
            this.f6642c.f6673l.m5521s(motionEvent, this.f6655p, i, this);
        }
        this.f6658s = motionEvent.getRawX();
        this.f6659t = motionEvent.getRawY();
        if (motionEvent.getAction() != 1 || (interfaceC1983f = this.f6655p) == null) {
            return;
        }
        interfaceC1983f.mo5399b();
        this.f6655p = null;
        int i2 = motionLayout.v0;
        if (i2 != -1) {
            m5446h(motionLayout, i2);
        }
    }

    /* renamed from: S */
    public final void m5436S(int i, MotionLayout motionLayout) {
        C2005b c2005b = (C2005b) this.f6647h.get(i);
        c2005b.f6961c = c2005b.f6960b;
        int i2 = this.f6649j.get(i);
        if (i2 > 0) {
            m5436S(i2, motionLayout);
            C2005b c2005b2 = (C2005b) this.f6647h.get(i2);
            if (c2005b2 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("ERROR! invalid deriveConstraintsFrom: @id/");
                sb.append(k75.m35104c(this.f6640a.getContext(), i2));
                return;
            } else {
                c2005b.f6961c += "/" + c2005b2.f6961c;
                c2005b.m5670M(c2005b2);
            }
        } else {
            c2005b.f6961c += "  layout";
            c2005b.m5669L(motionLayout);
        }
        c2005b.m5676h(c2005b);
    }

    /* renamed from: T */
    public void m5437T(MotionLayout motionLayout) {
        for (int i = 0; i < this.f6647h.size(); i++) {
            int iKeyAt = this.f6647h.keyAt(i);
            if (m5426I(iKeyAt)) {
                return;
            }
            m5436S(iKeyAt, motionLayout);
        }
    }

    /* renamed from: U */
    public void m5438U(int i, C2005b c2005b) {
        this.f6647h.put(i, c2005b);
    }

    /* renamed from: V */
    public void m5439V(int i) {
        b bVar = this.f6642c;
        if (bVar != null) {
            bVar.m5488E(i);
        } else {
            this.f6650k = i;
        }
    }

    /* renamed from: W */
    public void m5440W(boolean z) {
        this.f6656q = z;
        b bVar = this.f6642c;
        if (bVar == null || bVar.f6673l == null) {
            return;
        }
        this.f6642c.f6673l.m5526x(this.f6656q);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0094  */
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m5441X(int i, int i2) {
        int iM28078c;
        int iM28078c2;
        b bVar;
        Iterator it;
        Iterator it2;
        g5g g5gVar = this.f6641b;
        if (g5gVar != null) {
            iM28078c = g5gVar.m28078c(i, -1, -1);
            if (iM28078c == -1) {
                iM28078c = i;
            }
            iM28078c2 = this.f6641b.m28078c(i2, -1, -1);
            if (iM28078c2 == -1) {
            }
            bVar = this.f6642c;
            if (bVar == null && bVar.f6664c == i2 && this.f6642c.f6665d == i) {
                return;
            }
            it = this.f6644e.iterator();
            while (it.hasNext()) {
                b bVar2 = (b) it.next();
                if ((bVar2.f6664c == iM28078c2 && bVar2.f6665d == iM28078c) || (bVar2.f6664c == i2 && bVar2.f6665d == i)) {
                    this.f6642c = bVar2;
                    if (bVar2 == null || bVar2.f6673l == null) {
                        return;
                    }
                    this.f6642c.f6673l.m5526x(this.f6656q);
                    return;
                }
            }
            b bVar3 = this.f6645f;
            it2 = this.f6646g.iterator();
            while (it2.hasNext()) {
                b bVar4 = (b) it2.next();
                if (bVar4.f6664c == i2) {
                    bVar3 = bVar4;
                }
            }
            b bVar5 = new b(this, bVar3);
            bVar5.f6665d = iM28078c;
            bVar5.f6664c = iM28078c2;
            if (iM28078c != -1) {
                this.f6644e.add(bVar5);
            }
            this.f6642c = bVar5;
        }
        iM28078c = i;
        iM28078c2 = i2;
        bVar = this.f6642c;
        if (bVar == null) {
        }
        it = this.f6644e.iterator();
        while (it.hasNext()) {
        }
        b bVar32 = this.f6645f;
        it2 = this.f6646g.iterator();
        while (it2.hasNext()) {
        }
        b bVar52 = new b(this, bVar32);
        bVar52.f6665d = iM28078c;
        bVar52.f6664c = iM28078c2;
        if (iM28078c != -1) {
        }
        this.f6642c = bVar52;
    }

    /* renamed from: Y */
    public void m5442Y(b bVar) {
        this.f6642c = bVar;
        if (bVar == null || bVar.f6673l == null) {
            return;
        }
        this.f6642c.f6673l.m5526x(this.f6656q);
    }

    /* renamed from: Z */
    public void m5443Z() {
        b bVar = this.f6642c;
        if (bVar == null || bVar.f6673l == null) {
            return;
        }
        this.f6642c.f6673l.m5502A();
    }

    public boolean b0() {
        Iterator it = this.f6644e.iterator();
        while (it.hasNext()) {
            if (((b) it.next()).f6673l != null) {
                return true;
            }
        }
        b bVar = this.f6642c;
        return (bVar == null || bVar.f6673l == null) ? false : true;
    }

    public void c0(int i, View... viewArr) {
        this.f6657r.m5557i(i, viewArr);
    }

    /* renamed from: f */
    public void m5444f(MotionLayout motionLayout, int i) {
        Iterator it = this.f6644e.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f6674m.size() > 0) {
                Iterator it2 = bVar.f6674m.iterator();
                while (it2.hasNext()) {
                    ((b.a) it2.next()).m5501c(motionLayout);
                }
            }
        }
        Iterator it3 = this.f6646g.iterator();
        while (it3.hasNext()) {
            b bVar2 = (b) it3.next();
            if (bVar2.f6674m.size() > 0) {
                Iterator it4 = bVar2.f6674m.iterator();
                while (it4.hasNext()) {
                    ((b.a) it4.next()).m5501c(motionLayout);
                }
            }
        }
        Iterator it5 = this.f6644e.iterator();
        while (it5.hasNext()) {
            b bVar3 = (b) it5.next();
            if (bVar3.f6674m.size() > 0) {
                Iterator it6 = bVar3.f6674m.iterator();
                while (it6.hasNext()) {
                    ((b.a) it6.next()).m5499a(motionLayout, i, bVar3);
                }
            }
        }
        Iterator it7 = this.f6646g.iterator();
        while (it7.hasNext()) {
            b bVar4 = (b) it7.next();
            if (bVar4.f6674m.size() > 0) {
                Iterator it8 = bVar4.f6674m.iterator();
                while (it8.hasNext()) {
                    ((b.a) it8.next()).m5499a(motionLayout, i, bVar4);
                }
            }
        }
    }

    /* renamed from: g */
    public boolean m5445g(int i, gmb gmbVar) {
        return this.f6657r.m5552d(i, gmbVar);
    }

    /* renamed from: h */
    public boolean m5446h(MotionLayout motionLayout, int i) {
        b bVar;
        if (m5427J() || this.f6643d) {
            return false;
        }
        Iterator it = this.f6644e.iterator();
        while (it.hasNext()) {
            b bVar2 = (b) it.next();
            if (bVar2.f6675n != 0 && ((bVar = this.f6642c) != bVar2 || !bVar.m5487D(2))) {
                if (i == bVar2.f6665d && (bVar2.f6675n == 4 || bVar2.f6675n == 2)) {
                    MotionLayout.EnumC1987j enumC1987j = MotionLayout.EnumC1987j.FINISHED;
                    motionLayout.setState(enumC1987j);
                    motionLayout.setTransition(bVar2);
                    if (bVar2.f6675n == 4) {
                        motionLayout.C0();
                        motionLayout.setState(MotionLayout.EnumC1987j.SETUP);
                        motionLayout.setState(MotionLayout.EnumC1987j.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.h0(true);
                        motionLayout.setState(MotionLayout.EnumC1987j.SETUP);
                        motionLayout.setState(MotionLayout.EnumC1987j.MOVING);
                        motionLayout.setState(enumC1987j);
                        motionLayout.w0();
                    }
                    return true;
                }
                if (i == bVar2.f6664c && (bVar2.f6675n == 3 || bVar2.f6675n == 1)) {
                    MotionLayout.EnumC1987j enumC1987j2 = MotionLayout.EnumC1987j.FINISHED;
                    motionLayout.setState(enumC1987j2);
                    motionLayout.setTransition(bVar2);
                    if (bVar2.f6675n == 3) {
                        motionLayout.E0();
                        motionLayout.setState(MotionLayout.EnumC1987j.SETUP);
                        motionLayout.setState(MotionLayout.EnumC1987j.MOVING);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.h0(true);
                        motionLayout.setState(MotionLayout.EnumC1987j.SETUP);
                        motionLayout.setState(MotionLayout.EnumC1987j.MOVING);
                        motionLayout.setState(enumC1987j2);
                        motionLayout.w0();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: i */
    public b m5447i(int i, float f, float f2, MotionEvent motionEvent) {
        if (i == -1) {
            return this.f6642c;
        }
        List<b> listM5425H = m5425H(i);
        RectF rectF = new RectF();
        float f3 = 0.0f;
        b bVar = null;
        for (b bVar2 : listM5425H) {
            if (!bVar2.f6676o && bVar2.f6673l != null) {
                bVar2.f6673l.m5526x(this.f6656q);
                RectF rectFM5518p = bVar2.f6673l.m5518p(this.f6640a, rectF);
                if (rectFM5518p == null || motionEvent == null || rectFM5518p.contains(motionEvent.getX(), motionEvent.getY())) {
                    RectF rectFM5508f = bVar2.f6673l.m5508f(this.f6640a, rectF);
                    if (rectFM5508f == null || motionEvent == null || rectFM5508f.contains(motionEvent.getX(), motionEvent.getY())) {
                        float fM5503a = bVar2.f6673l.m5503a(f, f2);
                        if (bVar2.f6673l.f6702l && motionEvent != null) {
                            fM5503a = ((float) (Math.atan2(f2 + r10, f + r9) - Math.atan2(motionEvent.getX() - bVar2.f6673l.f6699i, motionEvent.getY() - bVar2.f6673l.f6700j))) * 10.0f;
                        }
                        float f4 = fM5503a * (bVar2.f6664c == i ? -1.0f : 1.1f);
                        if (f4 > f3) {
                            bVar = bVar2;
                            f3 = f4;
                        }
                    }
                }
            }
        }
        return bVar;
    }

    /* renamed from: j */
    public int m5448j() {
        b bVar = this.f6642c;
        if (bVar != null) {
            return bVar.f6677p;
        }
        return -1;
    }

    /* renamed from: k */
    public int m5449k() {
        b bVar = this.f6642c;
        if (bVar == null || bVar.f6673l == null) {
            return 0;
        }
        return this.f6642c.f6673l.m5506d();
    }

    /* renamed from: l */
    public C2005b m5450l(int i) {
        return m5451m(i, -1, -1);
    }

    /* renamed from: m */
    public C2005b m5451m(int i, int i2, int i3) {
        int iM28078c;
        g5g g5gVar = this.f6641b;
        if (g5gVar != null && (iM28078c = g5gVar.m28078c(i, i2, i3)) != -1) {
            i = iM28078c;
        }
        if (this.f6647h.get(i) != null) {
            return (C2005b) this.f6647h.get(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Warning could not find ConstraintSet id/");
        sb.append(k75.m35104c(this.f6640a.getContext(), i));
        sb.append(" In MotionScene");
        SparseArray sparseArray = this.f6647h;
        return (C2005b) sparseArray.get(sparseArray.keyAt(0));
    }

    /* renamed from: n */
    public int[] m5452n() {
        int size = this.f6647h.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = this.f6647h.keyAt(i);
        }
        return iArr;
    }

    /* renamed from: o */
    public ArrayList m5453o() {
        return this.f6644e;
    }

    /* renamed from: p */
    public int m5454p() {
        b bVar = this.f6642c;
        return bVar != null ? bVar.f6669h : this.f6650k;
    }

    /* renamed from: q */
    public int m5455q() {
        b bVar = this.f6642c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f6664c;
    }

    /* renamed from: r */
    public final int m5456r(Context context, String str) {
        int identifier = str.contains("/") ? context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), OutcomeConstants.OUTCOME_ID, context.getPackageName()) : -1;
        return (identifier != -1 || str.length() <= 1) ? identifier : Integer.parseInt(str.substring(1));
    }

    /* renamed from: s */
    public Interpolator m5457s() {
        int i = this.f6642c.f6666e;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(this.f6640a.getContext(), this.f6642c.f6668g);
        }
        if (i == -1) {
            return new a(q26.m44740c(this.f6642c.f6667f));
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new BounceInterpolator();
        }
        if (i == 5) {
            return new OvershootInterpolator();
        }
        if (i != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    /* renamed from: t */
    public void m5458t(gmb gmbVar) {
        b bVar = this.f6642c;
        if (bVar != null) {
            Iterator it = bVar.f6672k.iterator();
            while (it.hasNext()) {
                ((sc9) it.next()).m48186b(gmbVar);
            }
        } else {
            b bVar2 = this.f6645f;
            if (bVar2 != null) {
                Iterator it2 = bVar2.f6672k.iterator();
                while (it2.hasNext()) {
                    ((sc9) it2.next()).m48186b(gmbVar);
                }
            }
        }
    }

    /* renamed from: u */
    public float m5459u() {
        b bVar = this.f6642c;
        if (bVar == null || bVar.f6673l == null) {
            return 0.0f;
        }
        return this.f6642c.f6673l.m5509g();
    }

    /* renamed from: v */
    public float m5460v() {
        b bVar = this.f6642c;
        if (bVar == null || bVar.f6673l == null) {
            return 0.0f;
        }
        return this.f6642c.f6673l.m5510h();
    }

    /* renamed from: w */
    public boolean m5461w() {
        b bVar = this.f6642c;
        if (bVar == null || bVar.f6673l == null) {
            return false;
        }
        return this.f6642c.f6673l.m5511i();
    }

    /* renamed from: x */
    public float m5462x(float f, float f2) {
        b bVar = this.f6642c;
        if (bVar == null || bVar.f6673l == null) {
            return 0.0f;
        }
        return this.f6642c.f6673l.m5512j(f, f2);
    }

    /* renamed from: y */
    public final int m5463y(int i) {
        int iM28078c;
        g5g g5gVar = this.f6641b;
        return (g5gVar == null || (iM28078c = g5gVar.m28078c(i, -1, -1)) == -1) ? i : iM28078c;
    }

    /* renamed from: z */
    public int m5464z() {
        b bVar = this.f6642c;
        if (bVar == null || bVar.f6673l == null) {
            return 0;
        }
        return this.f6642c.f6673l.m5513k();
    }

    /* renamed from: androidx.constraintlayout.motion.widget.a$b */
    public static class b {

        /* renamed from: a */
        public int f6662a;

        /* renamed from: b */
        public boolean f6663b;

        /* renamed from: c */
        public int f6664c;

        /* renamed from: d */
        public int f6665d;

        /* renamed from: e */
        public int f6666e;

        /* renamed from: f */
        public String f6667f;

        /* renamed from: g */
        public int f6668g;

        /* renamed from: h */
        public int f6669h;

        /* renamed from: i */
        public float f6670i;

        /* renamed from: j */
        public final C1988a f6671j;

        /* renamed from: k */
        public ArrayList f6672k;

        /* renamed from: l */
        public C1989b f6673l;

        /* renamed from: m */
        public ArrayList f6674m;

        /* renamed from: n */
        public int f6675n;

        /* renamed from: o */
        public boolean f6676o;

        /* renamed from: p */
        public int f6677p;

        /* renamed from: q */
        public int f6678q;

        /* renamed from: r */
        public int f6679r;

        /* renamed from: androidx.constraintlayout.motion.widget.a$b$a */
        public static class a implements View.OnClickListener {

            /* renamed from: a */
            public final b f6680a;

            /* renamed from: b */
            public int f6681b;

            /* renamed from: c */
            public int f6682c;

            public a(Context context, b bVar, XmlPullParser xmlPullParser) {
                this.f6681b = -1;
                this.f6682c = 17;
                this.f6680a = bVar;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), mbe.OnClick);
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i);
                    if (index == mbe.OnClick_targetId) {
                        this.f6681b = typedArrayObtainStyledAttributes.getResourceId(index, this.f6681b);
                    } else if (index == mbe.OnClick_clickAction) {
                        this.f6682c = typedArrayObtainStyledAttributes.getInt(index, this.f6682c);
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v3, types: [android.view.View] */
            /* renamed from: a */
            public void m5499a(MotionLayout motionLayout, int i, b bVar) {
                int i2 = this.f6681b;
                MotionLayout motionLayoutFindViewById = motionLayout;
                if (i2 != -1) {
                    motionLayoutFindViewById = motionLayout.findViewById(i2);
                }
                if (motionLayoutFindViewById == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("OnClick could not find id ");
                    sb.append(this.f6681b);
                    return;
                }
                int i3 = bVar.f6665d;
                int i4 = bVar.f6664c;
                if (i3 == -1) {
                    motionLayoutFindViewById.setOnClickListener(this);
                    return;
                }
                int i5 = this.f6682c;
                boolean z = false;
                boolean z2 = ((i5 & 1) != 0 && i == i3) | ((i5 & 1) != 0 && i == i3) | ((i5 & 256) != 0 && i == i3) | ((i5 & 16) != 0 && i == i4);
                if ((i5 & 4096) != 0 && i == i4) {
                    z = true;
                }
                if (z2 || z) {
                    motionLayoutFindViewById.setOnClickListener(this);
                }
            }

            /* renamed from: b */
            public boolean m5500b(b bVar, MotionLayout motionLayout) {
                b bVar2 = this.f6680a;
                if (bVar2 == bVar) {
                    return true;
                }
                int i = bVar2.f6664c;
                int i2 = this.f6680a.f6665d;
                if (i2 == -1) {
                    return motionLayout.v0 != i;
                }
                int i3 = motionLayout.v0;
                return i3 == i2 || i3 == i;
            }

            /* renamed from: c */
            public void m5501c(MotionLayout motionLayout) {
                int i = this.f6681b;
                if (i == -1) {
                    return;
                }
                View viewFindViewById = motionLayout.findViewById(i);
                if (viewFindViewById != null) {
                    viewFindViewById.setOnClickListener(null);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(" (*)  could not find id ");
                sb.append(this.f6681b);
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MotionLayout motionLayout = this.f6680a.f6671j.f6640a;
                if (motionLayout.u0()) {
                    if (this.f6680a.f6665d == -1) {
                        int currentState = motionLayout.getCurrentState();
                        if (currentState == -1) {
                            motionLayout.F0(this.f6680a.f6664c);
                            return;
                        }
                        b bVar = new b(this.f6680a.f6671j, this.f6680a);
                        bVar.f6665d = currentState;
                        bVar.f6664c = this.f6680a.f6664c;
                        motionLayout.setTransition(bVar);
                        motionLayout.C0();
                        return;
                    }
                    b bVar2 = this.f6680a.f6671j.f6642c;
                    int i = this.f6682c;
                    boolean z = false;
                    boolean z2 = ((i & 1) == 0 && (i & 256) == 0) ? false : true;
                    boolean z3 = ((i & 16) == 0 && (i & 4096) == 0) ? false : true;
                    if (z2 && z3) {
                        b bVar3 = this.f6680a.f6671j.f6642c;
                        b bVar4 = this.f6680a;
                        if (bVar3 != bVar4) {
                            motionLayout.setTransition(bVar4);
                        }
                        if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                            z3 = false;
                            z = z2;
                        }
                    } else {
                        z = z2;
                    }
                    if (m5500b(bVar2, motionLayout)) {
                        if (z && (this.f6682c & 1) != 0) {
                            motionLayout.setTransition(this.f6680a);
                            motionLayout.C0();
                            return;
                        }
                        if (z3 && (this.f6682c & 16) != 0) {
                            motionLayout.setTransition(this.f6680a);
                            motionLayout.E0();
                        } else if (z && (this.f6682c & 256) != 0) {
                            motionLayout.setTransition(this.f6680a);
                            motionLayout.setProgress(1.0f);
                        } else {
                            if (!z3 || (this.f6682c & 4096) == 0) {
                                return;
                            }
                            motionLayout.setTransition(this.f6680a);
                            motionLayout.setProgress(0.0f);
                        }
                    }
                }
            }
        }

        public b(C1988a c1988a, b bVar) {
            this.f6662a = -1;
            this.f6663b = false;
            this.f6664c = -1;
            this.f6665d = -1;
            this.f6666e = 0;
            this.f6667f = null;
            this.f6668g = -1;
            this.f6669h = 400;
            this.f6670i = 0.0f;
            this.f6672k = new ArrayList();
            this.f6673l = null;
            this.f6674m = new ArrayList();
            this.f6675n = 0;
            this.f6676o = false;
            this.f6677p = -1;
            this.f6678q = 0;
            this.f6679r = 0;
            this.f6671j = c1988a;
            this.f6669h = c1988a.f6650k;
            if (bVar != null) {
                this.f6677p = bVar.f6677p;
                this.f6666e = bVar.f6666e;
                this.f6667f = bVar.f6667f;
                this.f6668g = bVar.f6668g;
                this.f6669h = bVar.f6669h;
                this.f6672k = bVar.f6672k;
                this.f6670i = bVar.f6670i;
                this.f6678q = bVar.f6678q;
            }
        }

        /* renamed from: A */
        public int m5484A() {
            return this.f6665d;
        }

        /* renamed from: B */
        public C1989b m5485B() {
            return this.f6673l;
        }

        /* renamed from: C */
        public boolean m5486C() {
            return !this.f6676o;
        }

        /* renamed from: D */
        public boolean m5487D(int i) {
            return (i & this.f6679r) != 0;
        }

        /* renamed from: E */
        public void m5488E(int i) {
            this.f6669h = Math.max(i, 8);
        }

        /* renamed from: F */
        public void m5489F(int i, String str, int i2) {
            this.f6666e = i;
            this.f6667f = str;
            this.f6668g = i2;
        }

        /* renamed from: G */
        public void m5490G(int i) {
            C1989b c1989bM5485B = m5485B();
            if (c1989bM5485B != null) {
                c1989bM5485B.m5527y(i);
            }
        }

        /* renamed from: H */
        public void m5491H(int i) {
            this.f6677p = i;
        }

        /* renamed from: t */
        public void m5492t(sc9 sc9Var) {
            this.f6672k.add(sc9Var);
        }

        /* renamed from: u */
        public void m5493u(Context context, XmlPullParser xmlPullParser) {
            this.f6674m.add(new a(context, this, xmlPullParser));
        }

        /* renamed from: v */
        public final void m5494v(C1988a c1988a, Context context, TypedArray typedArray) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                if (index == mbe.Transition_constraintSetEnd) {
                    this.f6664c = typedArray.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f6664c);
                    if ("layout".equals(resourceTypeName)) {
                        C2005b c2005b = new C2005b();
                        c2005b.m5666D(context, this.f6664c);
                        c1988a.f6647h.append(this.f6664c, c2005b);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.f6664c = c1988a.m5430M(context, this.f6664c);
                    }
                } else if (index == mbe.Transition_constraintSetStart) {
                    this.f6665d = typedArray.getResourceId(index, this.f6665d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.f6665d);
                    if ("layout".equals(resourceTypeName2)) {
                        C2005b c2005b2 = new C2005b();
                        c2005b2.m5666D(context, this.f6665d);
                        c1988a.f6647h.append(this.f6665d, c2005b2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.f6665d = c1988a.m5430M(context, this.f6665d);
                    }
                } else if (index == mbe.Transition_motionInterpolator) {
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 == 1) {
                        int resourceId = typedArray.getResourceId(index, -1);
                        this.f6668g = resourceId;
                        if (resourceId != -1) {
                            this.f6666e = -2;
                        }
                    } else if (i2 == 3) {
                        String string = typedArray.getString(index);
                        this.f6667f = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.f6668g = typedArray.getResourceId(index, -1);
                                this.f6666e = -2;
                            } else {
                                this.f6666e = -1;
                            }
                        }
                    } else {
                        this.f6666e = typedArray.getInteger(index, this.f6666e);
                    }
                } else if (index == mbe.Transition_duration) {
                    int i3 = typedArray.getInt(index, this.f6669h);
                    this.f6669h = i3;
                    if (i3 < 8) {
                        this.f6669h = 8;
                    }
                } else if (index == mbe.Transition_staggered) {
                    this.f6670i = typedArray.getFloat(index, this.f6670i);
                } else if (index == mbe.Transition_autoTransition) {
                    this.f6675n = typedArray.getInteger(index, this.f6675n);
                } else if (index == mbe.Transition_android_id) {
                    this.f6662a = typedArray.getResourceId(index, this.f6662a);
                } else if (index == mbe.Transition_transitionDisable) {
                    this.f6676o = typedArray.getBoolean(index, this.f6676o);
                } else if (index == mbe.Transition_pathMotionArc) {
                    this.f6677p = typedArray.getInteger(index, -1);
                } else if (index == mbe.Transition_layoutDuringTransition) {
                    this.f6678q = typedArray.getInteger(index, 0);
                } else if (index == mbe.Transition_transitionFlags) {
                    this.f6679r = typedArray.getInteger(index, 0);
                }
            }
            if (this.f6665d == -1) {
                this.f6663b = true;
            }
        }

        /* renamed from: w */
        public final void m5495w(C1988a c1988a, Context context, AttributeSet attributeSet) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mbe.Transition);
            m5494v(c1988a, context, typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* renamed from: x */
        public int m5496x() {
            return this.f6675n;
        }

        /* renamed from: y */
        public int m5497y() {
            return this.f6664c;
        }

        /* renamed from: z */
        public int m5498z() {
            return this.f6678q;
        }

        public b(int i, C1988a c1988a, int i2, int i3) {
            this.f6662a = -1;
            this.f6663b = false;
            this.f6664c = -1;
            this.f6665d = -1;
            this.f6666e = 0;
            this.f6667f = null;
            this.f6668g = -1;
            this.f6669h = 400;
            this.f6670i = 0.0f;
            this.f6672k = new ArrayList();
            this.f6673l = null;
            this.f6674m = new ArrayList();
            this.f6675n = 0;
            this.f6676o = false;
            this.f6677p = -1;
            this.f6678q = 0;
            this.f6679r = 0;
            this.f6662a = i;
            this.f6671j = c1988a;
            this.f6665d = i2;
            this.f6664c = i3;
            this.f6669h = c1988a.f6650k;
            this.f6678q = c1988a.f6651l;
        }

        public b(C1988a c1988a, Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
            this.f6662a = -1;
            this.f6663b = false;
            this.f6664c = -1;
            this.f6665d = -1;
            this.f6666e = 0;
            this.f6667f = null;
            this.f6668g = -1;
            this.f6669h = 400;
            this.f6670i = 0.0f;
            this.f6672k = new ArrayList();
            this.f6673l = null;
            this.f6674m = new ArrayList();
            this.f6675n = 0;
            this.f6676o = false;
            this.f6677p = -1;
            this.f6678q = 0;
            this.f6679r = 0;
            this.f6669h = c1988a.f6650k;
            this.f6678q = c1988a.f6651l;
            this.f6671j = c1988a;
            m5495w(c1988a, context, Xml.asAttributeSet(xmlPullParser));
        }
    }
}

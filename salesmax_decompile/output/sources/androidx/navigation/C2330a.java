package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.navigation.AbstractC2348o;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p001o.bce;
import p001o.e9g;
import p001o.id5;
import p001o.kf9;
import p001o.oef;
import p001o.sae;
import p001o.sq8;
import p001o.xk7;

@AbstractC2348o.b("activity")
/* renamed from: androidx.navigation.a */
/* loaded from: classes2.dex */
public class C2330a extends AbstractC2348o {

    /* renamed from: e */
    public static final a f9417e = new a(null);

    /* renamed from: c */
    public final Context f9418c;

    /* renamed from: d */
    public final Activity f9419d;

    /* renamed from: androidx.navigation.a$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: androidx.navigation.a$b */
    public static class b extends AbstractC2341h {

        /* renamed from: H */
        public Intent f9420H;

        /* renamed from: L */
        public String f9421L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC2348o abstractC2348o) {
            super(abstractC2348o);
            sq8.m48649h(abstractC2348o, "activityNavigator");
        }

        @Override // androidx.navigation.AbstractC2341h
        /* renamed from: O */
        public void mo8532O(Context context, AttributeSet attributeSet) {
            sq8.m48649h(context, "context");
            sq8.m48649h(attributeSet, "attrs");
            super.mo8532O(context, attributeSet);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, sae.ActivityNavigator);
            sq8.m48648g(typedArrayObtainAttributes, "context.resources.obtain…leable.ActivityNavigator)");
            f0(a0(context, typedArrayObtainAttributes.getString(sae.ActivityNavigator_targetPackage)));
            String string = typedArrayObtainAttributes.getString(sae.ActivityNavigator_android_name);
            if (string != null) {
                if (string.charAt(0) == '.') {
                    string = context.getPackageName() + string;
                }
                c0(new ComponentName(context, string));
            }
            b0(typedArrayObtainAttributes.getString(sae.ActivityNavigator_action));
            String strA0 = a0(context, typedArrayObtainAttributes.getString(sae.ActivityNavigator_data));
            if (strA0 != null) {
                d0(Uri.parse(strA0));
            }
            e0(a0(context, typedArrayObtainAttributes.getString(sae.ActivityNavigator_dataPattern)));
            typedArrayObtainAttributes.recycle();
        }

        @Override // androidx.navigation.AbstractC2341h
        /* renamed from: U */
        public boolean mo8533U() {
            return false;
        }

        /* renamed from: V */
        public final String m8534V() {
            Intent intent = this.f9420H;
            if (intent != null) {
                return intent.getAction();
            }
            return null;
        }

        /* renamed from: W */
        public final ComponentName m8535W() {
            Intent intent = this.f9420H;
            if (intent != null) {
                return intent.getComponent();
            }
            return null;
        }

        /* renamed from: Y */
        public final String m8536Y() {
            return this.f9421L;
        }

        /* renamed from: Z */
        public final Intent m8537Z() {
            return this.f9420H;
        }

        public final String a0(Context context, String str) {
            if (str == null) {
                return null;
            }
            String packageName = context.getPackageName();
            sq8.m48648g(packageName, "context.packageName");
            return e9g.m24593G(str, "${applicationId}", packageName, false, 4, null);
        }

        public final b b0(String str) {
            if (this.f9420H == null) {
                this.f9420H = new Intent();
            }
            Intent intent = this.f9420H;
            sq8.m48646e(intent);
            intent.setAction(str);
            return this;
        }

        public final b c0(ComponentName componentName) {
            if (this.f9420H == null) {
                this.f9420H = new Intent();
            }
            Intent intent = this.f9420H;
            sq8.m48646e(intent);
            intent.setComponent(componentName);
            return this;
        }

        public final b d0(Uri uri) {
            if (this.f9420H == null) {
                this.f9420H = new Intent();
            }
            Intent intent = this.f9420H;
            sq8.m48646e(intent);
            intent.setData(uri);
            return this;
        }

        public final b e0(String str) {
            this.f9421L = str;
            return this;
        }

        @Override // androidx.navigation.AbstractC2341h
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            if (super.equals(obj)) {
                Intent intent = this.f9420H;
                if ((intent != null ? intent.filterEquals(((b) obj).f9420H) : ((b) obj).f9420H == null) && sq8.m48644c(this.f9421L, ((b) obj).f9421L)) {
                    return true;
                }
            }
            return false;
        }

        public final b f0(String str) {
            if (this.f9420H == null) {
                this.f9420H = new Intent();
            }
            Intent intent = this.f9420H;
            sq8.m48646e(intent);
            intent.setPackage(str);
            return this;
        }

        @Override // androidx.navigation.AbstractC2341h
        public int hashCode() {
            int iHashCode = super.hashCode() * 31;
            Intent intent = this.f9420H;
            int iFilterHashCode = (iHashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
            String str = this.f9421L;
            return iFilterHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // androidx.navigation.AbstractC2341h
        public String toString() {
            ComponentName componentNameM8535W = m8535W();
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (componentNameM8535W != null) {
                sb.append(" class=");
                sb.append(componentNameM8535W.getClassName());
            } else {
                String strM8534V = m8534V();
                if (strM8534V != null) {
                    sb.append(" action=");
                    sb.append(strM8534V);
                }
            }
            String string = sb.toString();
            sq8.m48648g(string, "sb.toString()");
            return string;
        }
    }

    /* renamed from: androidx.navigation.a$c */
    public static final class c extends kf9 implements xk7 {

        /* renamed from: a */
        public static final c f9422a = new c();

        public c() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Context invoke(Context context) {
            sq8.m48649h(context, "it");
            if (context instanceof ContextWrapper) {
                return ((ContextWrapper) context).getBaseContext();
            }
            return null;
        }
    }

    public C2330a(Context context) {
        Object next;
        sq8.m48649h(context, "context");
        this.f9418c = context;
        Iterator it = oef.m42147f(context, c.f9422a).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.f9419d = (Activity) next;
    }

    @Override // androidx.navigation.AbstractC2348o
    /* renamed from: k */
    public boolean mo8529k() {
        Activity activity = this.f9419d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    @Override // androidx.navigation.AbstractC2348o
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public b mo8527a() {
        return new b(this);
    }

    @Override // androidx.navigation.AbstractC2348o
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public AbstractC2341h mo8528d(b bVar, Bundle bundle, C2345l c2345l, AbstractC2348o.a aVar) {
        Intent intent;
        int intExtra;
        String strEncode;
        sq8.m48649h(bVar, FirebaseAnalytics.Param.DESTINATION);
        if (bVar.m8537Z() == null) {
            throw new IllegalStateException(("Destination " + bVar.m8753A() + " does not have an Intent set.").toString());
        }
        Intent intent2 = new Intent(bVar.m8537Z());
        if (bundle != null) {
            intent2.putExtras(bundle);
            String strM8536Y = bVar.m8536Y();
            if (!(strM8536Y == null || strM8536Y.length() == 0)) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(strM8536Y);
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    if (!bundle.containsKey(strGroup)) {
                        throw new IllegalArgumentException(("Could not find " + strGroup + " in " + bundle + " to fill data pattern " + strM8536Y).toString());
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    Map mapM8772w = bVar.m8772w();
                    sq8.m48646e(strGroup);
                    C2331b c2331b = (C2331b) mapM8772w.get(strGroup);
                    AbstractC2347n abstractC2347nM8539a = c2331b != null ? c2331b.m8539a() : null;
                    if (abstractC2347nM8539a == null || (strEncode = abstractC2347nM8539a.mo8840i(abstractC2347nM8539a.mo8832a(bundle, strGroup))) == null) {
                        strEncode = Uri.encode(String.valueOf(bundle.get(strGroup)));
                    }
                    stringBuffer.append(strEncode);
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        if (this.f9419d == null) {
            intent2.addFlags(268435456);
        }
        if (c2345l != null && c2345l.m8810j()) {
            intent2.addFlags(536870912);
        }
        Activity activity = this.f9419d;
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", bVar.m8753A());
        Resources resources = this.f9418c.getResources();
        if (c2345l != null) {
            int iM8803c = c2345l.m8803c();
            int iM8804d = c2345l.m8804d();
            if ((iM8803c <= 0 || !sq8.m48644c(resources.getResourceTypeName(iM8803c), "animator")) && (iM8804d <= 0 || !sq8.m48644c(resources.getResourceTypeName(iM8804d), "animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", iM8803c);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", iM8804d);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Activity destinations do not support Animator resource. Ignoring popEnter resource ");
                sb.append(resources.getResourceName(iM8803c));
                sb.append(" and popExit resource ");
                sb.append(resources.getResourceName(iM8804d));
                sb.append(" when launching ");
                sb.append(bVar);
            }
        }
        this.f9418c.startActivity(intent2);
        if (c2345l != null && this.f9419d != null) {
            int iM8801a = c2345l.m8801a();
            int iM8802b = c2345l.m8802b();
            if ((iM8801a > 0 && sq8.m48644c(resources.getResourceTypeName(iM8801a), "animator")) || (iM8802b > 0 && sq8.m48644c(resources.getResourceTypeName(iM8802b), "animator"))) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Activity destinations do not support Animator resource. Ignoring enter resource ");
                sb2.append(resources.getResourceName(iM8801a));
                sb2.append(" and exit resource ");
                sb2.append(resources.getResourceName(iM8802b));
                sb2.append("when launching ");
                sb2.append(bVar);
            } else if (iM8801a >= 0 || iM8802b >= 0) {
                this.f9419d.overridePendingTransition(bce.m18601d(iM8801a, 0), bce.m18601d(iM8802b, 0));
            }
        }
        return null;
    }
}

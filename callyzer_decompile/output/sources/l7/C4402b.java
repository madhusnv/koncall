package l7;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC4154l;
import mx.AbstractC4913i;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import q7.C6140g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@m0("activity")
/* renamed from: l7.b */
/* loaded from: classes.dex */
public class C4402b extends n0 {

    /* renamed from: c */
    public final Context f22003c;

    /* renamed from: d */
    public final Activity f22004d;

    public C4402b(Context context) {
        Object next;
        AbstractC4154l.m8923f(context, "context");
        this.f22003c = context;
        Iterator it = AbstractC4913i.m9809e(new hq.d0(5), context).iterator();
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
        this.f22004d = (Activity) next;
    }

    @Override // l7.n0
    /* renamed from: a */
    public final AbstractC4422v mo9193a() {
        return new C4401a(this);
    }

    @Override // l7.n0
    /* renamed from: c */
    public final AbstractC4422v mo9194c(AbstractC4422v abstractC4422v, Bundle bundle, d0 d0Var) throws Resources.NotFoundException {
        Intent intent;
        int intExtra;
        C4401a c4401a = (C4401a) abstractC4422v;
        C6140g c6140g = c4401a.f22135b;
        if (c4401a.f21993g == null) {
            throw new IllegalStateException(AbstractC5601a.m11233d(c6140g.f29939e, " does not have an Intent set.", new StringBuilder("Destination ")).toString());
        }
        Intent intent2 = new Intent(c4401a.f21993g);
        if (bundle != null) {
            intent2.putExtras(bundle);
            String str = c4401a.f21994h;
            if (str != null && str.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    AbstractC4154l.m8920c(strGroup);
                    if (!bundle.containsKey(strGroup)) {
                        throw new IllegalArgumentException(("Could not find " + strGroup + " in " + bundle + " to fill data pattern " + str).toString());
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    C4408h c4408h = (C4408h) c4401a.m9249r().get(strGroup);
                    k0 k0Var = c4408h != null ? c4408h.f22040a : null;
                    stringBuffer.append(k0Var != null ? k0Var.mo9209f(k0Var.mo9203a(strGroup, bundle)) : Uri.encode(String.valueOf(bundle.get(strGroup))));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        Activity activity = this.f22004d;
        if (activity == null) {
            intent2.addFlags(268435456);
        }
        if (d0Var != null && d0Var.f22016a) {
            intent2.addFlags(536870912);
        }
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", c6140g.f29939e);
        Context context = this.f22003c;
        Resources resources = context.getResources();
        if (d0Var != null) {
            int i10 = d0Var.f22023h;
            int i11 = d0Var.f22024i;
            if ((i10 <= 0 || !AbstractC4154l.m8918a(resources.getResourceTypeName(i10), "animator")) && (i11 <= 0 || !AbstractC4154l.m8918a(resources.getResourceTypeName(i11), "animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i10);
                AbstractC4154l.m8920c(intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i11));
            } else {
                resources.getResourceName(i10);
                resources.getResourceName(i11);
                c4401a.toString();
            }
        }
        context.startActivity(intent2);
        if (d0Var != null && activity != null) {
            int i12 = d0Var.f22021f;
            int i13 = d0Var.f22022g;
            if ((i12 > 0 && AbstractC4154l.m8918a(resources.getResourceTypeName(i12), "animator")) || (i13 > 0 && AbstractC4154l.m8918a(resources.getResourceTypeName(i13), "animator"))) {
                resources.getResourceName(i12);
                resources.getResourceName(i13);
                c4401a.toString();
                return null;
            }
            if (i12 >= 0 || i13 >= 0) {
                if (i12 < 0) {
                    i12 = 0;
                }
                activity.overridePendingTransition(i12, i13 >= 0 ? i13 : 0);
            }
        }
        return null;
    }

    @Override // l7.n0
    /* renamed from: j */
    public final boolean mo9195j() {
        Activity activity = this.f22004d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}

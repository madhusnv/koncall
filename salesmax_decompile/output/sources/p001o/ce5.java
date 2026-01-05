package p001o;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.gu.toolargetool.TooLargeTool;

/* loaded from: classes6.dex */
public final class ce5 implements jf7 {
    @Override // p001o.jf7
    /* renamed from: a */
    public String mo21057a(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        sq8.m48649h(fragmentManager, "fragmentManager");
        sq8.m48649h(fragment, "fragment");
        sq8.m48649h(bundle, "bundle");
        String str = fragment.getClass().getSimpleName() + ".onSaveInstanceState wrote: " + TooLargeTool.bundleBreakdown(bundle);
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            return str;
        }
        return str + "\n* fragment arguments = " + TooLargeTool.bundleBreakdown(arguments);
    }

    @Override // p001o.jf7
    /* renamed from: b */
    public String mo21058b(Activity activity, Bundle bundle) {
        sq8.m48649h(activity, "activity");
        sq8.m48649h(bundle, "bundle");
        return activity.getClass().getSimpleName() + ".onSaveInstanceState wrote: " + TooLargeTool.bundleBreakdown(bundle);
    }
}

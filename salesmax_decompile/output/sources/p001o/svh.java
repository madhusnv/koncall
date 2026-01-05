package p001o;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class svh {

    /* renamed from: b */
    public View f46009b;

    /* renamed from: a */
    public final Map f46008a = new HashMap();

    /* renamed from: c */
    public final ArrayList f46010c = new ArrayList();

    public svh(View view) {
        this.f46009b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof svh)) {
            return false;
        }
        svh svhVar = (svh) obj;
        return this.f46009b == svhVar.f46009b && this.f46008a.equals(svhVar.f46008a);
    }

    public int hashCode() {
        return (this.f46009b.hashCode() * 31) + this.f46008a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f46009b + "\n") + "    values:";
        for (String str2 : this.f46008a.keySet()) {
            str = str + "    " + str2 + ": " + this.f46008a.get(str2) + "\n";
        }
        return str;
    }
}

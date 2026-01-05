package p001o;

import java.util.List;
import p001o.z0b;
import p001o.zh9;

/* loaded from: classes2.dex */
public final class fi9 {

    /* renamed from: a */
    public final zh9 f23395a;

    /* renamed from: b */
    public final gm5 f23396b;

    /* renamed from: c */
    public final List f23397c;

    public fi9(zh9 zh9Var, gm5 gm5Var, List list) {
        sq8.m48649h(zh9Var, "root");
        sq8.m48649h(gm5Var, "relayoutNodes");
        sq8.m48649h(list, "postponedMeasureRequests");
        this.f23395a = zh9Var;
        this.f23396b = gm5Var;
        this.f23397c = list;
    }

    /* renamed from: e */
    public static final void m26745e(fi9 fi9Var, StringBuilder sb, zh9 zh9Var, int i) {
        String strM26750f = fi9Var.m26750f(zh9Var);
        if (strM26750f.length() > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("..");
            }
            sb.append(strM26750f);
            sq8.m48648g(sb, "append(value)");
            sb.append('\n');
            sq8.m48648g(sb, "append('\\n')");
            i++;
        }
        List listM59445w = zh9Var.m59445w();
        int size = listM59445w.size();
        for (int i3 = 0; i3 < size; i3++) {
            m26745e(fi9Var, sb, (zh9) listM59445w.get(i3), i);
        }
    }

    /* renamed from: a */
    public final void m26746a() {
        if (!m26748c(this.f23395a)) {
            System.out.println((Object) m26749d());
            throw new IllegalStateException("Inconsistency found!");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m26747b(zh9 zh9Var) {
        Object obj;
        zh9 zh9VarM59431X = zh9Var.m59431X();
        Object obj2 = null;
        zh9.EnumC18640e enumC18640eM59415H = zh9VarM59431X != null ? zh9VarM59431X.m59415H() : null;
        if (zh9Var.mo49883a()) {
            if (zh9Var.m59422O()) {
                List list = this.f23397c;
                int size = list.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i);
                    z0b.C18538a c18538a = (z0b.C18538a) obj;
                    if (sq8.m48644c(c18538a.m58621a(), zh9Var) && !c18538a.m58623c()) {
                        break;
                    }
                    i++;
                }
                if (obj != null) {
                    return true;
                }
            }
            if (zh9Var.m59422O()) {
                if (!this.f23396b.m29036d(zh9Var)) {
                    if (!(zh9VarM59431X != null && zh9VarM59431X.m59422O())) {
                        if (!(zh9VarM59431X != null && zh9VarM59431X.m59417J()) && enumC18640eM59415H != zh9.EnumC18640e.Measuring) {
                            return false;
                        }
                    }
                }
                return true;
            }
            if (zh9Var.m59414G()) {
                return this.f23396b.m29036d(zh9Var) || zh9VarM59431X == null || zh9VarM59431X.m59422O() || zh9VarM59431X.m59414G() || enumC18640eM59415H == zh9.EnumC18640e.Measuring || enumC18640eM59415H == zh9.EnumC18640e.LayingOut;
            }
        } else if (zh9Var.m59432Y() != Integer.MAX_VALUE) {
            if (zh9VarM59431X != null && zh9VarM59431X.mo49883a()) {
            }
        }
        if (sq8.m48644c(zh9Var.t0(), Boolean.TRUE)) {
            if (zh9Var.m59417J()) {
                List list2 = this.f23397c;
                int size2 = list2.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        break;
                    }
                    Object obj3 = list2.get(i2);
                    z0b.C18538a c18538a2 = (z0b.C18538a) obj3;
                    if (sq8.m48644c(c18538a2.m58621a(), zh9Var) && c18538a2.m58623c()) {
                        obj2 = obj3;
                        break;
                    }
                    i2++;
                }
                if (obj2 != null) {
                    return true;
                }
            }
            if (zh9Var.m59417J()) {
                if (!this.f23396b.m29037e(zh9Var, true)) {
                    if (!(zh9VarM59431X != null && zh9VarM59431X.m59417J()) && enumC18640eM59415H != zh9.EnumC18640e.LookaheadMeasuring) {
                        if (!(zh9VarM59431X != null && zh9VarM59431X.m59422O()) || !sq8.m48644c(zh9Var.m59419L(), zh9Var)) {
                            return false;
                        }
                    }
                }
                return true;
            }
            if (zh9Var.m59416I()) {
                return this.f23396b.m29037e(zh9Var, true) || zh9VarM59431X == null || zh9VarM59431X.m59417J() || zh9VarM59431X.m59416I() || enumC18640eM59415H == zh9.EnumC18640e.LookaheadMeasuring || enumC18640eM59415H == zh9.EnumC18640e.LookaheadLayingOut || (zh9VarM59431X.m59414G() && sq8.m48644c(zh9Var.m59419L(), zh9Var));
            }
        }
        return true;
    }

    /* renamed from: c */
    public final boolean m26748c(zh9 zh9Var) {
        if (!m26747b(zh9Var)) {
            return false;
        }
        List listM59445w = zh9Var.m59445w();
        int size = listM59445w.size();
        for (int i = 0; i < size; i++) {
            if (!m26748c((zh9) listM59445w.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public final String m26749d() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tree state:");
        sq8.m48648g(sb, "append(value)");
        sb.append('\n');
        sq8.m48648g(sb, "append('\\n')");
        m26745e(this, sb, this.f23395a, 0);
        String string = sb.toString();
        sq8.m48648g(string, "stringBuilder.toString()");
        return string;
    }

    /* renamed from: f */
    public final String m26750f(zh9 zh9Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(zh9Var);
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        sb2.append(zh9Var.m59415H());
        sb2.append(']');
        sb.append(sb2.toString());
        if (!zh9Var.mo49883a()) {
            sb.append("[!isPlaced]");
        }
        sb.append("[measuredByParent=" + zh9Var.m59424Q() + ']');
        if (!m26747b(zh9Var)) {
            sb.append("[INCONSISTENT]");
        }
        String string = sb.toString();
        sq8.m48648g(string, "with(StringBuilder()) {\n…     toString()\n        }");
        return string;
    }
}

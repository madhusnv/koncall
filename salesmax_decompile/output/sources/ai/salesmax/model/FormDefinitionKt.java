package ai.salesmax.model;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p001o.e9g;
import p001o.f9g;
import p001o.sq8;

/* loaded from: classes.dex */
public final class FormDefinitionKt {
    public static final boolean __evaluateRule(Object obj, String str, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(" ");
        sb.append(str);
        sb.append(" ");
        sb.append(obj2);
        if (sq8.m48644c(str, "eq")) {
            return sq8.m48644c(obj, obj2);
        }
        if (sq8.m48644c(str, "ne")) {
            return !sq8.m48644c(obj, obj2);
        }
        if (sq8.m48644c(str, "in") && (obj2 instanceof List)) {
            if (!(obj instanceof List)) {
                return ((List) obj2).contains(obj);
            }
            Iterable iterable = (Iterable) obj;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    if (((List) obj2).contains(it.next())) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (!sq8.m48644c(str, "notIn") || !(obj2 instanceof List)) {
            return (sq8.m48644c(str, "startsWith") && (obj2 instanceof String) && (obj instanceof String)) ? e9g.m24595I((String) obj2, (String) obj, false) : (sq8.m48644c(str, "contains") && (obj2 instanceof String) && (obj instanceof String)) ? f9g.m26304N((CharSequence) obj2, (CharSequence) obj, false) : (sq8.m48644c(str, "notContains") && (obj2 instanceof String) && (obj instanceof String)) ? !f9g.m26304N((CharSequence) obj2, (CharSequence) obj, false) : sq8.m48644c(str, "EX") ? (obj == null || sq8.m48644c(obj, "")) ? false : true : sq8.m48644c(str, "NX") ? obj == null || sq8.m48644c(obj, "") : (sq8.m48644c(str, "gt") && (obj2 instanceof Number) && (obj instanceof Number)) ? ((Number) obj).doubleValue() > ((Number) obj2).doubleValue() : (sq8.m48644c(str, "gte") && (obj2 instanceof Number) && (obj instanceof Number)) ? ((Number) obj).doubleValue() >= ((Number) obj2).doubleValue() : (sq8.m48644c(str, "lt") && (obj2 instanceof Number) && (obj instanceof Number)) ? ((Number) obj).doubleValue() < ((Number) obj2).doubleValue() : sq8.m48644c(str, "lte") && (obj2 instanceof Number) && (obj instanceof Number) && ((Number) obj).doubleValue() <= ((Number) obj2).doubleValue();
        }
        if (!(obj instanceof List)) {
            return !((List) obj2).contains(obj);
        }
        Iterable iterable2 = (Iterable) obj;
        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
            Iterator it2 = iterable2.iterator();
            while (it2.hasNext()) {
                if (((List) obj2).contains(it2.next())) {
                    return true;
                }
            }
        }
        return false;
    }
}

package com.amplifyframework.api.aws;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.api.aws.SelectionSetUtils;
import com.amplifyframework.api.graphql.QueryType;
import com.amplifyframework.core.model.PropertyContainerPath;
import com.amplifyframework.core.model.PropertyPath;
import com.amplifyframework.core.model.PropertyPathMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import p001o.ch3;
import p001o.dh3;
import p001o.kf9;
import p001o.nif;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes5.dex */
public final class SelectionSetUtils {

    /* renamed from: com.amplifyframework.api.aws.SelectionSetUtils$replaceChild$1 */
    public static final class C102921 extends kf9 implements xk7 {
        final /* synthetic */ SelectionSet $selectionSet;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C102921(SelectionSet selectionSet) {
            super(1);
            this.$selectionSet = selectionSet;
        }

        @Override // p001o.xk7
        public final Boolean invoke(SelectionSet selectionSet) {
            return Boolean.valueOf(sq8.m48644c(selectionSet.getValue(), this.$selectionSet.getValue()));
        }
    }

    public static final SelectionSet asSelectionSetWithoutRoot(PropertyContainerPath propertyContainerPath) {
        Object next;
        sq8.m48649h(propertyContainerPath, "<this>");
        ArrayList arrayList = new ArrayList();
        List<PropertyContainerPath> listNodesInPath = nodesInPath(propertyContainerPath, false);
        ArrayList arrayList2 = new ArrayList(dh3.m23088v(listNodesInPath, 10));
        for (PropertyContainerPath propertyContainerPath2 : listNodesInPath) {
            arrayList.add(Boolean.valueOf(propertyContainerPath2.getMetadata().isCollection()));
            arrayList2.add(getSelectionSet(propertyContainerPath2));
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        Iterator it = arrayList2.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next2 = it.next();
        int i = 1;
        while (it.hasNext()) {
            int i2 = i + 1;
            if (i < 0) {
                ch3.m21256u();
            }
            SelectionSet selectionSet = (SelectionSet) it.next();
            SelectionSet selectionSet2 = (SelectionSet) next2;
            if (((Boolean) arrayList.get(i)).booleanValue()) {
                Set<SelectionSet> nodes = selectionSet.getNodes();
                sq8.m48648g(nodes, "getNodes(...)");
                Iterator<T> it2 = nodes.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (sq8.m48644c(((SelectionSet) next).getValue(), "items")) {
                        break;
                    }
                }
                SelectionSet selectionSet3 = (SelectionSet) next;
                if (selectionSet3 != null) {
                    replaceChild(selectionSet3, selectionSet2);
                }
            } else {
                replaceChild(selectionSet, selectionSet2);
            }
            i = i2;
            next2 = selectionSet;
        }
        return (SelectionSet) next2;
    }

    public static final SelectionSet findChildByName(SelectionSet selectionSet, String str) {
        Object next;
        sq8.m48649h(selectionSet, "<this>");
        sq8.m48649h(str, "name");
        Set<SelectionSet> nodes = selectionSet.getNodes();
        sq8.m48648g(nodes, "getNodes(...)");
        Iterator<T> it = nodes.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (sq8.m48644c(((SelectionSet) next).getValue(), str)) {
                break;
            }
        }
        return (SelectionSet) next;
    }

    private static final SelectionSet getSelectionSet(PropertyContainerPath propertyContainerPath) throws AmplifyException {
        PropertyPathMetadata metadata = propertyContainerPath.getMetadata();
        SelectionSet selectionSetBuild = SelectionSet.builder().operation(QueryType.GET).value(metadata.isCollection() ? "items" : metadata.getName()).requestOptions(new ApiGraphQLRequestOptions(0)).modelClass(propertyContainerPath.getModelType()).build();
        if (metadata.isCollection()) {
            selectionSetBuild = new SelectionSet(metadata.getName(), nif.m40666g(selectionSetBuild));
        }
        sq8.m48646e(selectionSetBuild);
        return selectionSetBuild;
    }

    public static final void mergeChild(SelectionSet selectionSet, SelectionSet selectionSet2) {
        sq8.m48649h(selectionSet, "<this>");
        sq8.m48649h(selectionSet2, "selectionSet");
        String value = selectionSet2.getValue();
        if (value == null) {
            value = "";
        }
        SelectionSet selectionSetFindChildByName = findChildByName(selectionSet, value);
        if (selectionSetFindChildByName == null) {
            selectionSet.getNodes().add(selectionSet2);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Set<SelectionSet> nodes = selectionSet2.getNodes();
        sq8.m48648g(nodes, "getNodes(...)");
        for (SelectionSet selectionSet3 : nodes) {
            String value2 = selectionSet3.getValue();
            sq8.m48648g(selectionSet3.getNodes(), "getNodes(...)");
            if (!(!r4.isEmpty()) || value2 == null) {
                sq8.m48646e(selectionSet3);
                arrayList.add(selectionSet3);
            } else if (findChildByName(selectionSetFindChildByName, value2) != null) {
                sq8.m48646e(selectionSet3);
                mergeChild(selectionSetFindChildByName, selectionSet3);
            } else {
                sq8.m48646e(selectionSet3);
                arrayList.add(selectionSet3);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            replaceChild(selectionSetFindChildByName, (SelectionSet) it.next());
        }
    }

    private static final List<PropertyContainerPath> nodesInPath(PropertyContainerPath propertyContainerPath, boolean z) {
        ArrayList arrayList = new ArrayList();
        while (propertyContainerPath != null && shouldProcessNode(propertyContainerPath, z)) {
            arrayList.add(propertyContainerPath);
            PropertyPath parent = propertyContainerPath.getMetadata().getParent();
            propertyContainerPath = parent instanceof PropertyContainerPath ? (PropertyContainerPath) parent : null;
        }
        return arrayList;
    }

    public static final void replaceChild(SelectionSet selectionSet, SelectionSet selectionSet2) {
        sq8.m48649h(selectionSet, "<this>");
        sq8.m48649h(selectionSet2, "selectionSet");
        Set<SelectionSet> nodes = selectionSet.getNodes();
        final C102921 c102921 = new C102921(selectionSet2);
        nodes.removeIf(new Predicate() { // from class: o.hcf
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return SelectionSetUtils.replaceChild$lambda$1(c102921, obj);
            }
        });
        selectionSet.getNodes().add(selectionSet2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean replaceChild$lambda$1(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    private static final boolean shouldProcessNode(PropertyContainerPath propertyContainerPath, boolean z) {
        return z || propertyContainerPath.getMetadata().getParent() != null;
    }
}

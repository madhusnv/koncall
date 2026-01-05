package ai.salesmax.model;

import ai.salesmax.model.ActionInteractiveKt;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class ActionInteractiveKt {

    /* renamed from: ai.salesmax.model.ActionInteractiveKt$convertToKotlinActionInteractive$1 */
    public static final class C00881 extends kf9 implements xk7 {
        public static final C00881 INSTANCE = new C00881();

        public C00881() {
            super(1);
        }

        @Override // p001o.xk7
        public final ReplyButton invoke(com.amplifyframework.datastore.generated.model.ReplyButton replyButton) {
            return new ReplyButton(replyButton.getTypeReply(), replyButton.getTitleReply(), replyButton.getIdReply());
        }
    }

    /* renamed from: ai.salesmax.model.ActionInteractiveKt$convertToKotlinActionInteractive$2 */
    public static final class C00892 extends kf9 implements xk7 {
        public static final C00892 INSTANCE = new C00892();

        /* renamed from: ai.salesmax.model.ActionInteractiveKt$convertToKotlinActionInteractive$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends kf9 implements xk7 {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(1);
            }

            @Override // p001o.xk7
            public final ProductWa invoke(com.amplifyframework.datastore.generated.model.ProductWa productWa) {
                return new ProductWa(productWa != null ? productWa.getProductRetailerId() : null);
            }
        }

        public C00892() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ProductWa invoke$lambda$0(xk7 xk7Var, Object obj) {
            sq8.m48649h(xk7Var, "$tmp0");
            return (ProductWa) xk7Var.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SectionRow invoke$lambda$2$lambda$1(xk7 xk7Var, Object obj) {
            sq8.m48649h(xk7Var, "$tmp0");
            return (SectionRow) xk7Var.invoke(obj);
        }

        @Override // p001o.xk7
        public final SectionInteractive invoke(com.amplifyframework.datastore.generated.model.SectionInteractive sectionInteractive) {
            List<com.amplifyframework.datastore.generated.model.ProductWa> sectionProductItems;
            Stream<com.amplifyframework.datastore.generated.model.ProductWa> stream;
            List list;
            if (sectionInteractive != null && (sectionProductItems = sectionInteractive.getSectionProductItems()) != null && (stream = sectionProductItems.stream()) != null) {
                final AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
                Stream<R> map = stream.map(new Function() { // from class: ai.salesmax.model.a
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ActionInteractiveKt.C00892.invoke$lambda$0(anonymousClass1, obj);
                    }
                });
                if (map != 0 && (list = (List) map.collect(Collectors.toList())) != null) {
                    Stream<com.amplifyframework.datastore.generated.model.SectionRow> stream2 = sectionInteractive.getSectionRows().stream();
                    final ActionInteractiveKt$convertToKotlinActionInteractive$2$2$1 actionInteractiveKt$convertToKotlinActionInteractive$2$2$1 = ActionInteractiveKt$convertToKotlinActionInteractive$2$2$1.INSTANCE;
                    Object objCollect = stream2.map(new Function() { // from class: ai.salesmax.model.b
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ActionInteractiveKt.C00892.invoke$lambda$2$lambda$1(actionInteractiveKt$convertToKotlinActionInteractive$2$2$1, obj);
                        }
                    }).collect(Collectors.toList());
                    sq8.m48648g(objCollect, "collect(...)");
                    return new SectionInteractive(list, (List) objCollect, sectionInteractive.getSectionTitle());
                }
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ActionInteractive convertToKotlinActionInteractive(com.amplifyframework.datastore.generated.model.ActionInteractive actionInteractive) {
        List arrayList;
        List arrayList2;
        String str;
        Stream<com.amplifyframework.datastore.generated.model.SectionInteractive> stream;
        Stream<com.amplifyframework.datastore.generated.model.ReplyButton> stream2;
        sq8.m48649h(actionInteractive, "javaAction");
        String actionName = actionInteractive.getActionName();
        String displayText = actionInteractive.getDisplayText();
        String ctaUrl = actionInteractive.getCtaUrl();
        String addressCountry = actionInteractive.getAddressCountry();
        List<String> savedAddresses = actionInteractive.getSavedAddresses();
        sq8.m48648g(savedAddresses, "getSavedAddresses(...)");
        String button = actionInteractive.getButton();
        List<com.amplifyframework.datastore.generated.model.ReplyButton> buttons = actionInteractive.getButtons();
        FlowActionPayload flowActionPayload = null;
        if (buttons == null || (stream2 = buttons.stream()) == null) {
            arrayList = null;
        } else {
            final C00881 c00881 = C00881.INSTANCE;
            Stream<R> map = stream2.map(new Function() { // from class: o.sm
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ActionInteractiveKt.convertToKotlinActionInteractive$lambda$0(c00881, obj);
                }
            });
            if (map != 0) {
                arrayList = (List) map.collect(Collectors.toList());
            }
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        String catalogId = actionInteractive.getCatalogId();
        String productRetailerId = actionInteractive.getProductRetailerId();
        List<com.amplifyframework.datastore.generated.model.SectionInteractive> sections = actionInteractive.getSections();
        if (sections == null || (stream = sections.stream()) == null) {
            arrayList2 = null;
        } else {
            final C00892 c00892 = C00892.INSTANCE;
            Stream<R> map2 = stream.map(new Function() { // from class: o.tm
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ActionInteractiveKt.convertToKotlinActionInteractive$lambda$1(c00892, obj);
                }
            });
            if (map2 != 0) {
                arrayList2 = (List) map2.collect(Collectors.toList());
            }
        }
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        String flowMode = actionInteractive.getFlowMode();
        String flowMessageVersion = actionInteractive.getFlowMessageVersion();
        String flowToken = actionInteractive.getFlowToken();
        String flowId = actionInteractive.getFlowId();
        String flowCta = actionInteractive.getFlowCta();
        String flowAction = actionInteractive.getFlowAction();
        if (actionInteractive.getFlowActionPayload() != null) {
            str = flowToken;
            flowActionPayload = new FlowActionPayload(actionInteractive.getFlowActionPayload().getScreen(), actionInteractive.getFlowActionPayload().getFlowData());
        } else {
            str = flowToken;
        }
        return new ActionInteractive(actionName, displayText, ctaUrl, addressCountry, savedAddresses, button, arrayList, catalogId, productRetailerId, arrayList2, flowMode, flowMessageVersion, str, flowId, flowCta, flowAction, flowActionPayload);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReplyButton convertToKotlinActionInteractive$lambda$0(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (ReplyButton) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SectionInteractive convertToKotlinActionInteractive$lambda$1(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (SectionInteractive) xk7Var.invoke(obj);
    }
}

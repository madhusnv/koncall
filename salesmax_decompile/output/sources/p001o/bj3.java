package p001o;

import com.amazonaws.amplify.generated.graphql.CreateCommentMutation;
import com.amplifyframework.api.aws.GsonVariablesSerializer;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.api.graphql.SimpleGraphQLRequest;
import com.amplifyframework.datastore.generated.model.Comment;
import type.CreateCommentInput;

/* loaded from: classes.dex */
public interface bj3 extends kkc {
    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default x8c Ba(SimpleGraphQLRequest simpleGraphQLRequest, Boolean bool) {
        return !bool.booleanValue() ? x6c.m55694H(new RuntimeException("The account subscription has expired")) : executeGraphQL(simpleGraphQLRequest).m55014i(new ggd() { // from class: o.xi3
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return this.f53799a.raiseIfErrorInResponse((GraphQLResponse) obj);
            }
        }).m27844k(new rl7() { // from class: o.yi3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return (CreateCommentMutation.Data) ((GraphQLResponse) obj).getData();
            }
        }).m27844k(new rl7() { // from class: o.zi3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ((CreateCommentMutation.Data) obj).createComment();
            }
        }).m27844k(new rl7() { // from class: o.aj3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f14838a.bj((CreateCommentMutation.CreateComment) obj);
            }
        }).m27846n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default Comment bj(CreateCommentMutation.CreateComment createComment) {
        return (Comment) sf(createComment, Comment.class);
    }

    default x6c g9(CreateCommentInput createCommentInput) {
        final SimpleGraphQLRequest simpleGraphQLRequest = new SimpleGraphQLRequest("mutation CreateComment($input: CreateCommentInput!, $condition: ModelCommentConditionInput) {\n  createComment(input: $input, condition: $condition) {\n    __typename\n    id\n    accountId\n    ownerId\n    mentioned {\n       __typename\n       entityType\n       entityId\n    }\n    body\n    engagementId\n    activityId\n    parentEngagementId\n    createdAt\n    updatedAt\n  }\n}", toVariablesMap(CreateCommentMutation.builder().input(createCommentInput).build()), CreateCommentMutation.Data.class, new GsonVariablesSerializer());
        return isAccountSubscriptionActive().m55717M(new rl7() { // from class: o.wi3
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f52179a.Ba(simpleGraphQLRequest, (Boolean) obj);
            }
        });
    }

    default CreateCommentInput.Builder i3(String str) {
        return CreateCommentInput.builder().accountId(on()).ownerId(Eo()).body(str);
    }
}

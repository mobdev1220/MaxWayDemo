// Generated by Dagger (https://dagger.dev).
package uz.gita.maxwaydemo.mobdev.di.maindi.home;

import com.google.firebase.firestore.FirebaseFirestore;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HomeFirebaseModule_GetFirebaseStoreFactory implements Factory<FirebaseFirestore> {
  private final HomeFirebaseModule module;

  public HomeFirebaseModule_GetFirebaseStoreFactory(HomeFirebaseModule module) {
    this.module = module;
  }

  @Override
  public FirebaseFirestore get() {
    return getFirebaseStore(module);
  }

  public static HomeFirebaseModule_GetFirebaseStoreFactory create(HomeFirebaseModule module) {
    return new HomeFirebaseModule_GetFirebaseStoreFactory(module);
  }

  public static FirebaseFirestore getFirebaseStore(HomeFirebaseModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.getFirebaseStore());
  }
}
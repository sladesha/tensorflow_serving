// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model_service.proto

package tensorflow.serving;

public final class ModelServiceOuterClass {
  private ModelServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\023model_service.proto\022\022tensorflow.servin" +
      "g\032\026get_model_status.proto\032\026model_managem" +
      "ent.proto2\347\001\n\014ModelService\022g\n\016GetModelSt" +
      "atus\022).tensorflow.serving.GetModelStatus" +
      "Request\032*.tensorflow.serving.GetModelSta" +
      "tusResponse\022n\n\031HandleReloadConfigRequest" +
      "\022\'.tensorflow.serving.ReloadConfigReques" +
      "t\032(.tensorflow.serving.ReloadConfigRespo" +
      "nseB\003\370\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          GetModelStatus.getDescriptor(),
          ModelManagement.getDescriptor(),
        });
    GetModelStatus.getDescriptor();
    ModelManagement.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

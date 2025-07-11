//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'vobjects_object_name_actions_merge_post_request_inner.g.dart';

/// VobjectsObjectNameActionsMergePostRequestInner
///
/// Properties:
/// * [duplicateRecordId] 
/// * [mainRecordId] 
@BuiltValue()
abstract class VobjectsObjectNameActionsMergePostRequestInner implements Built<VobjectsObjectNameActionsMergePostRequestInner, VobjectsObjectNameActionsMergePostRequestInnerBuilder> {
  @BuiltValueField(wireName: r'duplicate_record_id')
  String? get duplicateRecordId;

  @BuiltValueField(wireName: r'main_record_id')
  String? get mainRecordId;

  VobjectsObjectNameActionsMergePostRequestInner._();

  factory VobjectsObjectNameActionsMergePostRequestInner([void updates(VobjectsObjectNameActionsMergePostRequestInnerBuilder b)]) = _$VobjectsObjectNameActionsMergePostRequestInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(VobjectsObjectNameActionsMergePostRequestInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<VobjectsObjectNameActionsMergePostRequestInner> get serializer => _$VobjectsObjectNameActionsMergePostRequestInnerSerializer();
}

class _$VobjectsObjectNameActionsMergePostRequestInnerSerializer implements PrimitiveSerializer<VobjectsObjectNameActionsMergePostRequestInner> {
  @override
  final Iterable<Type> types = const [VobjectsObjectNameActionsMergePostRequestInner, _$VobjectsObjectNameActionsMergePostRequestInner];

  @override
  final String wireName = r'VobjectsObjectNameActionsMergePostRequestInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    VobjectsObjectNameActionsMergePostRequestInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.duplicateRecordId != null) {
      yield r'duplicate_record_id';
      yield serializers.serialize(
        object.duplicateRecordId,
        specifiedType: const FullType(String),
      );
    }
    if (object.mainRecordId != null) {
      yield r'main_record_id';
      yield serializers.serialize(
        object.mainRecordId,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    VobjectsObjectNameActionsMergePostRequestInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required VobjectsObjectNameActionsMergePostRequestInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'duplicate_record_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.duplicateRecordId = valueDes;
          break;
        case r'main_record_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.mainRecordId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  VobjectsObjectNameActionsMergePostRequestInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = VobjectsObjectNameActionsMergePostRequestInnerBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}


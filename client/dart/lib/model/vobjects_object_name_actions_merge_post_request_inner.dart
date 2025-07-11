//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class VobjectsObjectNameActionsMergePostRequestInner {
  /// Returns a new [VobjectsObjectNameActionsMergePostRequestInner] instance.
  VobjectsObjectNameActionsMergePostRequestInner({
    this.duplicateRecordId,
    this.mainRecordId,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? duplicateRecordId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? mainRecordId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is VobjectsObjectNameActionsMergePostRequestInner &&
    other.duplicateRecordId == duplicateRecordId &&
    other.mainRecordId == mainRecordId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (duplicateRecordId == null ? 0 : duplicateRecordId!.hashCode) +
    (mainRecordId == null ? 0 : mainRecordId!.hashCode);

  @override
  String toString() => 'VobjectsObjectNameActionsMergePostRequestInner[duplicateRecordId=$duplicateRecordId, mainRecordId=$mainRecordId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.duplicateRecordId != null) {
      json[r'duplicate_record_id'] = this.duplicateRecordId;
    } else {
      json[r'duplicate_record_id'] = null;
    }
    if (this.mainRecordId != null) {
      json[r'main_record_id'] = this.mainRecordId;
    } else {
      json[r'main_record_id'] = null;
    }
    return json;
  }

  /// Returns a new [VobjectsObjectNameActionsMergePostRequestInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static VobjectsObjectNameActionsMergePostRequestInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "VobjectsObjectNameActionsMergePostRequestInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "VobjectsObjectNameActionsMergePostRequestInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return VobjectsObjectNameActionsMergePostRequestInner(
        duplicateRecordId: mapValueOfType<String>(json, r'duplicate_record_id'),
        mainRecordId: mapValueOfType<String>(json, r'main_record_id'),
      );
    }
    return null;
  }

  static List<VobjectsObjectNameActionsMergePostRequestInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <VobjectsObjectNameActionsMergePostRequestInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = VobjectsObjectNameActionsMergePostRequestInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, VobjectsObjectNameActionsMergePostRequestInner> mapFromJson(dynamic json) {
    final map = <String, VobjectsObjectNameActionsMergePostRequestInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = VobjectsObjectNameActionsMergePostRequestInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of VobjectsObjectNameActionsMergePostRequestInner-objects as value to a dart map
  static Map<String, List<VobjectsObjectNameActionsMergePostRequestInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<VobjectsObjectNameActionsMergePostRequestInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = VobjectsObjectNameActionsMergePostRequestInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


@isTest
private class OASVobjectsObjectNameActionsMergePosTest {
    @isTest
    private static void equalsSameInstance() {
        OASVobjectsObjectNameActionsMergePos vobjectsObjectNameActionsMergePostRequestInner1 = OASVobjectsObjectNameActionsMergePos.getExample();
        OASVobjectsObjectNameActionsMergePos vobjectsObjectNameActionsMergePostRequestInner2 = vobjectsObjectNameActionsMergePostRequestInner1;
        OASVobjectsObjectNameActionsMergePos vobjectsObjectNameActionsMergePostRequestInner3 = new OASVobjectsObjectNameActionsMergePos();
        OASVobjectsObjectNameActionsMergePos vobjectsObjectNameActionsMergePostRequestInner4 = vobjectsObjectNameActionsMergePostRequestInner3;

        System.assert(vobjectsObjectNameActionsMergePostRequestInner1.equals(vobjectsObjectNameActionsMergePostRequestInner2));
        System.assert(vobjectsObjectNameActionsMergePostRequestInner2.equals(vobjectsObjectNameActionsMergePostRequestInner1));
        System.assert(vobjectsObjectNameActionsMergePostRequestInner1.equals(vobjectsObjectNameActionsMergePostRequestInner1));
        System.assert(vobjectsObjectNameActionsMergePostRequestInner3.equals(vobjectsObjectNameActionsMergePostRequestInner4));
        System.assert(vobjectsObjectNameActionsMergePostRequestInner4.equals(vobjectsObjectNameActionsMergePostRequestInner3));
        System.assert(vobjectsObjectNameActionsMergePostRequestInner3.equals(vobjectsObjectNameActionsMergePostRequestInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASVobjectsObjectNameActionsMergePos vobjectsObjectNameActionsMergePostRequestInner1 = OASVobjectsObjectNameActionsMergePos.getExample();
        OASVobjectsObjectNameActionsMergePos vobjectsObjectNameActionsMergePostRequestInner2 = OASVobjectsObjectNameActionsMergePos.getExample();
        OASVobjectsObjectNameActionsMergePos vobjectsObjectNameActionsMergePostRequestInner3 = new OASVobjectsObjectNameActionsMergePos();
        OASVobjectsObjectNameActionsMergePos vobjectsObjectNameActionsMergePostRequestInner4 = new OASVobjectsObjectNameActionsMergePos();

        System.assert(vobjectsObjectNameActionsMergePostRequestInner1.equals(vobjectsObjectNameActionsMergePostRequestInner2));
        System.assert(vobjectsObjectNameActionsMergePostRequestInner2.equals(vobjectsObjectNameActionsMergePostRequestInner1));
        System.assert(vobjectsObjectNameActionsMergePostRequestInner3.equals(vobjectsObjectNameActionsMergePostRequestInner4));
        System.assert(vobjectsObjectNameActionsMergePostRequestInner4.equals(vobjectsObjectNameActionsMergePostRequestInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASVobjectsObjectNameActionsMergePos vobjectsObjectNameActionsMergePostRequestInner1 = OASVobjectsObjectNameActionsMergePos.getExample();
        OASVobjectsObjectNameActionsMergePos vobjectsObjectNameActionsMergePostRequestInner2 = new OASVobjectsObjectNameActionsMergePos();

        System.assertEquals(false, vobjectsObjectNameActionsMergePostRequestInner1.equals('foo'));
        System.assertEquals(false, vobjectsObjectNameActionsMergePostRequestInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASVobjectsObjectNameActionsMergePos vobjectsObjectNameActionsMergePostRequestInner1 = OASVobjectsObjectNameActionsMergePos.getExample();
        OASVobjectsObjectNameActionsMergePos vobjectsObjectNameActionsMergePostRequestInner2 = new OASVobjectsObjectNameActionsMergePos();
        OASVobjectsObjectNameActionsMergePos vobjectsObjectNameActionsMergePostRequestInner3;

        System.assertEquals(false, vobjectsObjectNameActionsMergePostRequestInner1.equals(vobjectsObjectNameActionsMergePostRequestInner3));
        System.assertEquals(false, vobjectsObjectNameActionsMergePostRequestInner2.equals(vobjectsObjectNameActionsMergePostRequestInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASVobjectsObjectNameActionsMergePos vobjectsObjectNameActionsMergePostRequestInner1 = OASVobjectsObjectNameActionsMergePos.getExample();
        OASVobjectsObjectNameActionsMergePos vobjectsObjectNameActionsMergePostRequestInner2 = new OASVobjectsObjectNameActionsMergePos();

        System.assertEquals(vobjectsObjectNameActionsMergePostRequestInner1.hashCode(), vobjectsObjectNameActionsMergePostRequestInner1.hashCode());
        System.assertEquals(vobjectsObjectNameActionsMergePostRequestInner2.hashCode(), vobjectsObjectNameActionsMergePostRequestInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASVobjectsObjectNameActionsMergePos vobjectsObjectNameActionsMergePostRequestInner1 = OASVobjectsObjectNameActionsMergePos.getExample();
        OASVobjectsObjectNameActionsMergePos vobjectsObjectNameActionsMergePostRequestInner2 = OASVobjectsObjectNameActionsMergePos.getExample();
        OASVobjectsObjectNameActionsMergePos vobjectsObjectNameActionsMergePostRequestInner3 = new OASVobjectsObjectNameActionsMergePos();
        OASVobjectsObjectNameActionsMergePos vobjectsObjectNameActionsMergePostRequestInner4 = new OASVobjectsObjectNameActionsMergePos();

        System.assert(vobjectsObjectNameActionsMergePostRequestInner1.equals(vobjectsObjectNameActionsMergePostRequestInner2));
        System.assert(vobjectsObjectNameActionsMergePostRequestInner3.equals(vobjectsObjectNameActionsMergePostRequestInner4));
        System.assertEquals(vobjectsObjectNameActionsMergePostRequestInner1.hashCode(), vobjectsObjectNameActionsMergePostRequestInner2.hashCode());
        System.assertEquals(vobjectsObjectNameActionsMergePostRequestInner3.hashCode(), vobjectsObjectNameActionsMergePostRequestInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASVobjectsObjectNameActionsMergePos vobjectsObjectNameActionsMergePostRequestInner = new OASVobjectsObjectNameActionsMergePos();
        Map<String, String> x-property-mappings = vobjectsObjectNameActionsMergePostRequestInner.getx-property-mappings();
        System.assertEquals('duplicateRecordId', x-property-mappings.get('duplicate_record_id'));
        System.assertEquals('mainRecordId', x-property-mappings.get('main_record_id'));
    }
}

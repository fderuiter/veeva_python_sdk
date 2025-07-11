const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}duplicate_record_id`,
                label: `[${labelPrefix}duplicate_record_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}main_record_id`,
                label: `[${labelPrefix}main_record_id]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'duplicate_record_id': bundle.inputData?.[`${keyPrefix}duplicate_record_id`],
            'main_record_id': bundle.inputData?.[`${keyPrefix}main_record_id`],
        }
    },
}

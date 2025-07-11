<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for objectsDocumentsBatchPUT
 */
class ObjectsDocumentsBatchPUTParameterData
{
    /**
     * @DTA\Data(subset="header", field="Authorization", nullable=true)
     * @DTA\Strategy(subset="header", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="header", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $authorization = null;

    /**
     * @DTA\Data(subset="header", field="Accept", nullable=true)
     * @DTA\Strategy(subset="header", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="header", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $accept = null;

    /**
     * When set to true, Vault allows you to change the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header.Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt;
     * @DTA\Data(subset="header", field="X-VaultAPI-MigrationMode", nullable=true)
     * @DTA\Strategy(subset="header", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="header", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $x_vault_api_migration_mode = null;

    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * @DTA\Data(subset="header", field="X-VaultAPI-ClientID", nullable=true)
     * @DTA\Strategy(subset="header", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="header", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $x_vault_api_client_id = null;

    /**
     * @DTA\Data(subset="header", field="Content-Type", nullable=true)
     * @DTA\Strategy(subset="header", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="header", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $content_type = null;

}

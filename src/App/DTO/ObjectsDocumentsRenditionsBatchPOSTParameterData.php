<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for objectsDocumentsRenditionsBatchPOST
 */
class ObjectsDocumentsRenditionsBatchPOSTParameterData
{
    /**
     * @DTA\Data(subset="header", field="Authorization", nullable=true)
     * @DTA\Strategy(subset="header", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="header", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $authorization = null;

    /**
     * If set to true, indicates that the renditions to add are of the Large Size Asset (large_size_asset__v) rendition type. Vault applies Document Migration Mode limitations to renditions created with the request, but Document Migration permission is not required and your vault need not be in Migration Mode to use the parameter. Note that the request results in an error if the CSV contains any rendition type other than large_size_asset__v.
     * @DTA\Data(subset="query", field="largeSizeAsset", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $large_size_asset = null;

    /**
     * @DTA\Data(subset="header", field="Accept", nullable=true)
     * @DTA\Strategy(subset="header", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="header", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $accept = null;

    /**
     * Must be set to true when importing any rendition type other than large_size_asset__v. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt;
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
     * If you’re identifying documents in your input by their external ID
     * @DTA\Data(subset="query", field="idParam", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $id_param = null;

    /**
     * @DTA\Data(subset="header", field="Content-Type", nullable=true)
     * @DTA\Strategy(subset="header", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="header", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $content_type = null;

}

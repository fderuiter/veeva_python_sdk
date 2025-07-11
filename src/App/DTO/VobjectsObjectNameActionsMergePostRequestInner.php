<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class VobjectsObjectNameActionsMergePostRequestInner
{
    /**
     * @DTA\Data(field="duplicate_record_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $duplicate_record_id = null;

    /**
     * @DTA\Data(field="main_record_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $main_record_id = null;

}
